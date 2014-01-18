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
  
  def sign_out
    self.current_user = nil
    cookies.delete(:remember_token)
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
  
  def current_user?(user)
    user == current_user
  end
  
  def signed_in_user
    unless signed_in?
      store_location
      redirect_to signin_url, notice: "Please sign in."        
      #以下のようにも書ける
      #flash[:notice] = "Please sign in."
      #redirect_to signin_url
    end
  end
  
  def redirect_back_or(default)
    redirect_to(session[:return_to] || default)
    session.delete(:return_to)
  end
  
  def store_location
    session[:return_to] = request.url
  end
  
end
