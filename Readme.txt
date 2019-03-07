eureka-server 功能包含：
1. 服务注册
2. 服务消费
3. Eureka服务器启动
3. 端口号：81

eureka-service 服务提供者：
1. 注册到eureka服务
2. 服务id: service1
3. 端口号：82

eureka-service2 服务提供者：
1. 注册到eureka服务
2. 服务id: service1
3. 端口号：83

eureka-ribbon 负载均衡：
1. 注册到eureka服务
2. 服务id: ribbon-consumer
3. 端口号：84

eureka-feign 服务消费者：
1. 注册到eureka服务
2. 服务id: feign-consumer
3. 端口号：85
4. 包括ribbon特性

eureka-gateway 网关：
1. 注册到eureka服务
2. 服务id: Service-Gateway
3. 端口号：100





