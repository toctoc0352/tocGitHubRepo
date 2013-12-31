module SessionsHelper

  def sign_in(user)
      #cookies.permanent
      #  value : user.remember_token
      #  expires(cookiesの有効期限) : 20年後
      cookies.permanent[:remember_token] = user.remember_token
      self.current_user = user
  end 
end
