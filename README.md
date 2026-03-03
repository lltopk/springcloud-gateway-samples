# springcloud-openfeign-samples
springcloud-openfeign-samples

## 环境准备
gateway服务依赖
```xml
    <!--spring cloud gateway-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-gateway</artifactId>
    </dependency>
    <!-- 负载均衡-->
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-loadbalancer</artifactId>
    </dependency>
    <!--nacos 服务发现-->
    <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
    </dependency>
```

其余微服务均需要服务发现
```xml
    <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
    </dependency>
```

## 测试请求
```shell
GET http://localhost:8080/lltopk-server1/server1/get/1
GET http://localhost:8080/lltopk-server2/server2/get/2
```
