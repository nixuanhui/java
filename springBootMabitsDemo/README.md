## SpringBoot+Mybatis样例


### 使用注意事项：
    - 需要在数据库中使用sql文件创建表
    - 修改application.yml配置文件中的数据库连接信息，数据库名称，账号密码等
    - 测试链接：http://127.0.0.1:8080/testUser/getUser?id=3
    
    
### 一路走来碰到的坑：
    - Whitelabel Error Page
      This application has no explicit mapping for /error, so you are seeing this as a fallback.
      Fri Apr 09 13:02:50 CST 2018
      There was an unexpected error (type=Internal Server Error, status=500).
      No message available
      解决方法：找不到controller类，基本是文件路径问题，参考现在的文件路径即可  
      
    - Cannot load driver class: com.mysql.jdbc.Driver
      解决方法：缺少mysqL依赖。添加下面的内容就好。
              <dependency>
              <groupId>mysql</groupId>
              <artifactId>mysql-connector-java</artifactId>
              </dependency> 
             
    - 使用新版mybatis时，配置文件最好是使用“.yml”结尾，
      启动类屏蔽掉自动导入注释“@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)”
      这样能规避好多麻烦事