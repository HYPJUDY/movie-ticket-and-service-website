## TestReport
#1.测试环境：SYSU-SECURE

#2.测试各服务器的IP
主服务器：172.20.10.7
从服务器：172.20.10.3
测试机：172.20.10.6

#3.测试命令
1）测试命令：
登录：
![testreport1](../assets/images/test1.png)
其中，data.txt文件里为：
![testreport2](../assets/images/test2.png)
订票：
![testreport3](../assets/images/test3.png)
其中，data.txt文件里为：
![testreport4](../assets/images/test4.png)

2）测试结果：
<1>未开启负载均衡（Nginx）的单服务器测试结果：
![testreport5](../assets/images/test5.png)
从图中可以看出，并发数为10（增大也差不多）时，每秒的支持的请求数平均为3.14，每个请求的处理时间平均为3187ms（98%的请求都接近3000ms）；
<2>使用负载均衡后测试结果：
![testreport6](../assets/images/test6.png)
可以看出，这里每秒平均支持的请求数已经达到27.4，每个登录请求的平均时间为366.9ms；继续增大并发数（并发数为20时,基本达到了最大值），性能有了极大的提高。
![testreport7](../assets/images/test7.png)
可以看到，这里每秒支持的登录请求数已经达到了186.29，每个请求的处理时间平均为107.357，性能有了极大的提高；
<3>测试后数据库变化如下：
![testreport8](../assets/images/test8.png)
用户信息如下：
![testreport9](../assets/images/test9.png)
