# nash
all in

# 一个整体的项目

---
## 项目的环境

* centos环境

1. 配置ip
    ```
    查看ens33网卡的配置： vi /etc/sysconfig/network-scripts/ifcfg-ens33 
    将ONBOOT=yes \
    然后重启网络服务： sudo service network restart 
    ```
2. 安装jdk 
    - 官网下载jdk版本
    - tar -zxvf 文件名 解压文件
    ```
    vi /etc/profile
    在profile中添加如下内容：
    #set java environment
    JAVA_HOME=/home/jdk-11.0.1
    CLASS_PATH=.:$JAVA_HOME/lib
    PATH=$PATH:$JAVA_HOME/bin
    export JAVA_HOME CLASS_PATH PATH 
    让修改生效：
    [root@localhost java]# source /etc/profile 
    ```
3. 安装mysql 
4. 安装redis
5. 安装elasticsearch
6. 安装mongodb
7. 安装zookeeper

* 项目后端涉及技术
* 项目前端涉及技术


