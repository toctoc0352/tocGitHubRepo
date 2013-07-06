class User < ActiveRecord::Base
  attr_accessible :email, :name
  
  #1人のユーザーに複数のマイクロポストがある。
  has_many :microposts
end
