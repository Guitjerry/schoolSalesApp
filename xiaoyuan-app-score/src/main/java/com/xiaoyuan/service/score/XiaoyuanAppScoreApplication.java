package com.xiaoyuan.service.score;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;





@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class XiaoyuanAppScoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaoyuanAppScoreApplication.class, args);
	}
}
