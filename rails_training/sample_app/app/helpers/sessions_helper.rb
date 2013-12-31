module SessionsHelper

  def sign_in(user)
      #cookies.permanent
      #  value : user.remember_token
      #  expires(cookiesの有効期限) : 20年後
      cookies.permanent[:remember_token] = user.remember_token
      self.current_user = user
  end 

  def signed_in?
    !current_user.nil?
  end 

    
  #current_userへの要素代入を定義
  def current_user=(user)
    @current_user = user    
  end

  #current_userの取得
  def current_user
    #||= (or equal)
    # A ||= B
    #   AがnilならBを代入、そうでなければ代入しない
    @current_user ||= User.find_by_remember_token(cookies[:remember_token])    
  end
  
end
