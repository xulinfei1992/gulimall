package com.atguigu.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xulinfei
 */
@EnableFeignClients("com.atguigu.gulimall")
@ComponentScan("com.atguigu.gulimall")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMembereApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallMembereApplication.class, args);
    }
}
