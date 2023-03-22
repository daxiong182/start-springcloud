package com.courage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy  //设置该类是网关的启动类
@EnableAutoConfiguration //可以将Spring boot应用所有符合条件的@configuration配置加载到当前 Spring Boot 创建并使用的Ioc容器中
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
