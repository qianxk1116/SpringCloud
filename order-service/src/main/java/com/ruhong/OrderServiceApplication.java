package com.ruhong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class OrderServiceApplication {

    // springboot启动类
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
