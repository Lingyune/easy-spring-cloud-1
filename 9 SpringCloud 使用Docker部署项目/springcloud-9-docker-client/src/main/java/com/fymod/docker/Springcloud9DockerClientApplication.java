package com.fymod.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springcloud9DockerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud9DockerClientApplication.class, args);
	}
}
