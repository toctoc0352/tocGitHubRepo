require 'spec_helper'

describe User do
  before { @user = User.new(name: "Exsample User", email: "user@exsample.com") }
  
  subject { @user }
  
  it { should respond_to(:name) }
  #下記のように書くこともできる
  #it 'User should respond to name' do 
  #   @user.should respond_to(:name)
  #end
    
  it { should respond_to(:email) }
  
  #@userオブジェクトが有効かどうか
  #@user.valid? の実行と同義
  it { should be_valid }
  
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
  
end
