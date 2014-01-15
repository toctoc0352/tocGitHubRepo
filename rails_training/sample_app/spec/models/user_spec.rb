require 'spec_helper'

describe User do
  before { @user = User.new(name: "Exsample User", email: "user@exsample.com", 
                            password: "foobar", password_confirmation: "foobar") }
  
  subject { @user }
  
  it { should respond_to(:name) }
  #下記のように書くこともできる
  #it 'should respond to name' do 
  #   @user.should respond_to(:name)
  #end
    
  it { should respond_to(:email) }
  it { should respond_to(:password_digest) }
  it { should respond_to(:password_confirmation) }
  it { should respond_to(:remember_token) }
  it { should respond_to(:admin) }
  it { should respond_to(:authenticate) }
  it { should respond_to(:microposts) }
  
  #@userオブジェクトが有効かどうか
  #@user.valid? の実行と同義
  it { should be_valid }
  it { should_not be_admin }
  
  describe "with admin attribute set to 'true'" do
    before do
      @user.save!
      @user.toggle!(:admin)
    end
    
    it { should be_admin }
  end
  
  describe "when name is not presence" do
    before {@user.name = " "}
    it { should_not be_valid }
  end

  describe "when email is not presence" do
    before {@user.email = " "}
    it { should_not be_valid }
  end

  describe "when name is too long" do
    before {@user.name = "a"*51}
    it { should_not be_valid }
  end
    
  describe "when email format invalid" do
    it "should be invalid" do
      addresses = %w[ user@foo,com user_at_foo.org exsampe.user@foo.foo@bar_baz.com foo@bar+baz.com ]
      addresses.each do |invalid_address|
        @user.email = invalid_address
        @user.should_not be_valid
      end
    end
  end
  
  describe "when email format valid" do
    it "should be valid" do
      addresses = %w[ user@foo.COM A_US_ER@f.b.org first.lst@foo.jo a+b@baz.cn]
      addresses.each do |valid_address|
        @user.email = valid_address
        @user.should be_valid
      end
    end
  end

  describe "when email address is already taken" do
    before do
      user_with_same_email = @user.dup
      user_with_same_email.email = @user.email.upcase
      user_with_same_email.save
    end

    it { should_not be_valid }
  end
  
  describe "email address with mixed case" do
     let(:mixed_case_email) { "Foo@ExAMPle.CoM" }
 
     it "should be saved as all lower-case" do
       @user.email = mixed_case_email
       @user.save
       @user.reload.email.should == mixed_case_email.downcase
     end
   end

  describe "when password is not present" do
    before { @user.password = @user.password_confirmation = " " }
    it { should_not be_valid }
  end

  describe "when password doesn't match confirmation" do
    before { @user.password_confirmation = "mismatch" }
    it { should_not be_valid }
  end
  
  describe "when password confirmation is nil" do
    before { @user.password_confirmation = nil }
    it { should_not be_valid }
  end

  describe "with a password that's too short" do
    before { @user.password = @user.password_confirmation = "a" * 5 }
    it { should be_invalid }
  end
  
  describe "return value of authenticate method" do
    before { @user.save }
    let(:found_user) { User.find_by_email(@user.email) }
  
    describe "with valid password" do
      it { should == found_user.authenticate(@user.password) }
    end
  
    describe "with invalid password" do
      let(:user_for_invalid_password) { found_user.authenticate("invalid") }
  
      it { should_not == user_for_invalid_password }
      specify { user_for_invalid_password.should be_false }
      #itと同義
      #itを使用すると英語として不自然な場合にこれで代用することができる 
      # it { user_for_invalid_password.should be_false }
    end
  end
  
  describe "remember token" do
    before { @user.save }
    its(:remember_token){ should_not be_blank }
    #以下のコードと等価
    #it { @user.remember_token.should_not be_blank }
  end
  
  describe "accessible attributes" do
    it "should not allow access to admin" do
      expect do
        User.new(admin: true)
      end.to raise_error(ActiveModel::MassAssignmentSecurity::Error)
    end
  end

  describe "micropost associations" do
    before { @user.save }
    let!(:older_micropost) do
      FactoryGirl.create(:micropost, user: @user, created_at: 1.days.ago)
    end
    let!(:newer_micropost) do
      FactoryGirl.create(:micropost, user: @user, created_at: 1.hour.ago)
    end
    
    it "should have the right microposts in the right order" do
      @user.microposts.should == [newer_micropost, older_micropost]
    end
    
    it "should destroy associated microposts" do
      microposts = @user.microposts.dup
      @user.destroy
      microposts.should_not be_empty
      microposts.each do |micropost|
        Micropost.find_by_id(micropost.id).should be_nil
      end
    end    
  end
end
