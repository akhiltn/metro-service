package com.metroservice.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutesApplication.class, args);
	}
}
