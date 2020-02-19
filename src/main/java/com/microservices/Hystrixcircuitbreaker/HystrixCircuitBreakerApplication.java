package com.microservices.Hystrixcircuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
@EnableCircuitBreaker
public class HystrixCircuitBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixCircuitBreakerApplication.class, args);
	}

}
