# springcloud-sample
spring cloud sample

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