class SessionsController < ApplicationController
  def new
  end
  
  def create
    user = User.find_by_email(params[:session][:email].downcase)
    if user && user.authenticate(params[:sessinon][:password])
      #TODO ユーザをサインインさせ、ユーザーページ (show) にリダイレクトする。
    else
      #flash.now
      #flashの場合とは異なり、他のリクエストが発生したらすぐにメッセージを消す
      flash.now[:error] = 'Invalid email/password combination'
      render 'new'
    end
  end
  
  def destroy
  end
end
