package com.openeye.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceGateWayApplication.class, args);
	}

}
