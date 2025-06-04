1、添加模块module(springboot应用，微服务)
2、配置模块的pom.xml(添加openfieng starter)
3、配置模块的application.yaml
4、编写Controller
5、编写Service(使用@FeignClient注解， name=“微服务的应用名”)
6、编写ConsumeApp启动类（使用@EnableFeignClients)