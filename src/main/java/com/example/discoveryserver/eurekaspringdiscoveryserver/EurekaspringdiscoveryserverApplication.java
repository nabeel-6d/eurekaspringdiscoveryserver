package com.example.discoveryserver.eurekaspringdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaspringdiscoveryserverApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaspringdiscoveryserverApplication.class, args);
	}

}
