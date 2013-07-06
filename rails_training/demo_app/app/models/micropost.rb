class Micropost < ActiveRecord::Base
  attr_accessible :content, :user_id
  
  #1つのマイクロポストは1人のユーザーにのみ属する
  belongs_to :user
  
  validates :content, :length => { :maximum => 140 }
end
