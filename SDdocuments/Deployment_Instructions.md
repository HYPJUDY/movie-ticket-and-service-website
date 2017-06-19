# Deployment Instruction

### To run the application, please follow the instructions below:

1. Download `movie-ticket-and-service-website` repository.
2. Download and config MySQL Server. For example, you can refer to [Ubuntu下安装MySQL及简单操作](http://www.linuxidc.com/Linux/2016-07/133128.htm). Now you should have successfully started sql by using command `net start MySQL` in cmd (better to run as administrator>.

3. Note that in `/movie-ticket-and-service-website/src/main/webapp/WEB-INF/applicationContext.xml`, the default username and password are set as follow:
    
``` xml
<property name="username" value="root" />
<property name="password" value="root" />
```
    
   You can change the password value to one of your MySQL root user's passwords. Or config the default password in MySQL:
   * Log in as root user: `mysql -u root -p`. The default password is empty (directly press `Enter` key).
   * Change the password to `root`: `mysql> set password for root@localhost = password('root');`

4. Create database (`mysql> CREATE DATABASE movie_ticket;`) and use database (`mysql> use movie_ticket;`).
5. Create tables and insert some values by copy all contents in `/movie-ticket-and-service-website/src/main/resources/mysql_ddl.sql` to `mysql>` command line. (If you have error in chinese characters decoding, plese refer to [Convert to UTF-8](https://stackoverflow.com/questions/6115612/how-to-convert-an-entire-mysql-database-characterset-and-collation-to-utf-8))

6. Run `movie-ticket-and-service-website` application in Eclipse.
    * Import the project (path: `movie-ticket-and-service-website/codes/movie-ticket-and-service-website/`) to Eclipse.
    * Run -> Run as -> Maven build... -> Goals:"clean compile jetty:run"

### Note that following steps are not necessary and basic on linux system. If you just want to run the applications, you can skip to step 9, but remember to add port number 8080 in the url to visit in your browser, such as `http://localhost:8080/login`.

7. Download the [Nginx-1.13.0](http://www.nginx.org/) and follow the configure instructions refering to [ubuntu nginx 安装以及配置文件详解](http://linmomo02.iteye.com/blog/1490657).

8. Replace the file "nginx.conf" in "/usr/local/nginx/conf/" with our nginx configure file in the documents.

9. Visit `http://localhost/login` in your browser to log in. The VIP customer (which is set in `mysql_ddl.sql`) is `"linxp", "111"`. You can directly log in as `linxp`.
10. Visit `http://localhost/signup` in your browser to sign up. Remember the usename and password you set and then try to log in.
