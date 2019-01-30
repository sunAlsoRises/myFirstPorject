# 这是搭建好的springclouddemo,目的是工作中拿来即用

## 也是本人提交到github的第一个项目



## 技术选型:
    mysql
    mybatis
    druid
    lombok      (对象管理)
    springboot  
    springcloud         (微服务之家)
    springcloud-eureka-server   (微服务注册)
    springcloud-eureka          (微服务客户端,发现)
    spring-cloud-starter-ribbon  负载均衡 (提供模板 访问微服务模式的负载均衡)
    spring-cloud-starter-feign    负载均衡 (在ribbon基础上 进一步以访问接口模式开发实现负载均衡目的)
    spring-cloud-starter-hystrix  断路器  同样可以实现服务器降级处理
    spring-cloud-starter-hystrix-dashboard 服务监控 整合断路器使用
    spring-cloud-starter-zuul  路由网管
    spring-cloud-config-server   微服务集中配置服务
    spring-cloud-config         微服务配置中心客户端
    

## 项目架构
       microsevicecloud  pom父工程
        microsevicecloud-api 公共模块
        microservicecloud-provider-dept-8001 :  集成了eureka的服务提供者
        microservicecloud-provider-dept-8002 :  集成了eureka的服务提供者
        microservicecloud-provider-dept-8002 :  集成了eureka的服务提供者
                                                 创建三个提供者为了达到分布式调用服务器目的
        microservicecloud-eureka-7001   :服务的注册与发现  
        microservicecloud-eureka-7002   :服务的注册与发现
        microservicecloud-eureka-7003   :服务的注册与发现 
                                                 以集群的方式创建三个eurka的服务
        microservicecloud-consumer-dept-80  : 服务的消费者 (也即用户)
        microservicecloud-consumer-dept-feign : 集成了负载均衡的服务的消费者
        microservicecloud-consumer-hystrix-dashboard: 集成了服务的监控以及服务降级的服务消费者
        microservicecloud-provider-dept-hystrix-8001: 如果服务的消费者想要使用服务的监控hystrix,那么服务的提供者也需要提供相应的hystrix
        microservicecloud-zuul-gateway-9527 : 负责管理整个微服务的路由网关
        
        microservicecloud-config-3344 : 微服务的集中配置中心服务端
        microservicecloud-config-client-3355 : 微服务的而集中配置客户端(通过访问服务端进而获取配置)
        microservicecloud-config-dept-client-8001 :微服务的而集中配置客户端(通过访问服务端进而获取配置)
        microservicecloud-config-eureka-client-7001 :微服务的而集中配置客户端(通过访问服务端进而获取配置)
      
      #SpringCloud2018.mmap 为整个项目的笔记                                                                                  