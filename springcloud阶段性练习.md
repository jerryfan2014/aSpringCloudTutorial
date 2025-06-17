# 完成quickstart-order模块的开发（巩固服务注册与发现、openFeign的使用、API网关使用）

1、添加module（模块），模块名称是quickstart-order,父工程是quickstart
2、在test数据库中添加订单表order，包括字段
    id, long ,订单ID,非业务主键
    order_no, string , 订单号（唯一), unique
    order_amt, double, 订单金额
    order_user_id, long, 订单的用户Id
3、quickstart-order模块实现一个方法，getOrdersByUserId(userId)
4、quickstart-user模块添加一个方法，获取用户订单信息, findOrder(userId), 
通过openFeign去远程调用quickstart-order的getOrdersByUserId接口
5、要求只能通过api网关(quickstart-gateway)配置访问quickstart-user

注意：
需要在quickstart-common定义Order