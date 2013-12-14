require 'spec_helper'

describe "UserPages" do

  subject { page }

  describe "signup page" do
     before { visit signup_path }
 
     it { should have_selector('h1',    text: 'Sign up') }
     it { should have_selector('title', text: 'Sign up') }
  end
  
  describe "signup" do
    before {visit signup_path}
    
    let(:submit) { "Create my account" }
    
    #無効なユーザの登録
    describe "with invalid information" do
      it "should not create a user" do
        expect { click_button submit }.not_to change(User, :count)
      end    
    end
    
    #有効なユーザの登録
    describe "with valid information" do
      before do
        #各入力項目を入力
        fill_in "Name",               with: "Example User"
        fill_in "Email",              with: "user@exsample.com"
        fill_in "Password",           with: "foobar"
        fill_in "Confirmation",       with: "foobar"
      end
      
      it "should create a user" do
        expect { click_button submit }.to change(User, :count).by(1)
      end    
    end  
  end
  
  describe "profile page" do
    let(:user) { FactoryGirl.create(:user) }
    before { visit user_path(user) }

    it { should have_selector('h1',    text: user.name) }
    it { should have_selector('title', text: user.name) }
  end
  
end
