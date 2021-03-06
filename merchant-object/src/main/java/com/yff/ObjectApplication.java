package com.yff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class ObjectApplication {
    /**
     * 访问地址 http://localhost:8081/actuator/hystrix.stream看响应数据
     * http://localhost:8081/hystrix打开监控仪表盘
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ObjectApplication.class,args);
    }
}
