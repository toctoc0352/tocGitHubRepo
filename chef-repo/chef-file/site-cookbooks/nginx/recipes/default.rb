#
# Cookbook Name:: nginx
# Recipe:: default
#
# Copyright 2013, YOUR_COMPANY_NAME
#
# All rights reserved - Do Not Redistribute
#

package "nginx" do
  action :install
end

#nginxの起動
service "nginx" do
  supports :status => true, :restart => true, :reload => true
  action [ :enable, :start ]
end

#設定ファイルの設置
template "nginx.conf" do
  path "/etc/nginx/nginx.conf"
  owner "root"
  group "root"
  mode 0644

  #ファイルが更新されたら、サービスをリロード
  notifies :reload, 'service[nginx]'
end
