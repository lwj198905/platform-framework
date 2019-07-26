# platform-framework
轻量级的Java快速开发平台，能快速开发项目
使用当下最流行的Spring+SpringMVC+Mybatis+Shiro+J2Cache技术
友好的代码结构及注释，便于阅读及二次开发
完善的XSS防范及脚本过滤，彻底杜绝XSS攻击
 日志分级输出，便于分析日志
前端使用Vue+iView，上手容易


部署说明：
1.创建mysql数据库，数据库名称为platform，导入数据建表语句
2.项目导入IDEA或Eclipse开发工具，修改数据连接配置文件
platform-admin/src/main/resources/dev/platform.properties和platform-admin/src/main/resources/prod/platform.properties
3.解压Redis-x64-3.2.100压缩包，启动redis-server.exe（项目运行需要redis支持）
4将项目放入web容器（tomcat）中启动
5.访问项目http://localhost:XXXX/platform-admin   账户admin 密码admin

注：项目运行需要Maven环境哦
