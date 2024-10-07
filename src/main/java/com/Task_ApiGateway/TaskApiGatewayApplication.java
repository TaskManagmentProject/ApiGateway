package com.Task_ApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TaskApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApiGatewayApplication.class, args);
	}

}
