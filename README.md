# springcloud-sample
spring cloud sample

# features
## sidecar
register function components with eureka servers without any modification, espectially heterogeneous components or
 technologies those are based on java platfomat
### instances
* eureka-client-c registered with eureka-server-c
* eureka-client-c-sidecar registered with eureka-server-a and eureka-server-b
* service-consumer registered with eureka-server-a and eureka-server-b

### enable sidecar
* create sidecar project: eureka-client-sidecar-c
* eureka-client-c-sidecar -- pom
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-netflix-sidecar</artifactId>
</dependency>
```
* eureka-client-c-sidecar -- application.yml  
```
sidecar:
  port: 9203
  health-uri: http://localhost:9203/health
```
* access
```  
http://${eureka-client-c-sidecar-host}:${c-sidecar-port}
```
* service-consumer  
invokes apis of eureka-client-c by feign
* eureka-client-c
invoke other services registered with eureka servers:  
```
http://${eureka-client-c-sidecar-host}:${c-sidecar-port}/${service-id}/${service-uri}
```

# QA
## services only register with one eureka server: a or b
### reason  
hostnames of eureka servers are not setted
### resolution
1. set different hostnames for eureka servers: servera and serverb .etc
2. if running at locathost, modify /etc/hosts(linux, windows other location)
```
127.0.0.1 servera
127.0.0.1 serverb
```

## feign timeout config is invalid
### reason  
feign timeout configurations are different in springboot 1.x and 2.x
### resolution
1. springboot 2.x
```
feign:
  client:
    config:
      default:
        connectTimeout: 5000
        readTimeout: 6000
```