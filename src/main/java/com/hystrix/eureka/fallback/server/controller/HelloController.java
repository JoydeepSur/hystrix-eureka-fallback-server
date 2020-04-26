package com.hystrix.eureka.fallback.server.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/rest/eureka/server")
public class HelloController {
	
	@GetMapping
	public String hello() {
		
		return "Hello World!!";
	}
}
