package com.hystrix.eureka.fallback.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HystrixEurekaFallbackServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixEurekaFallbackServerApplication.class, args);
	}

}
