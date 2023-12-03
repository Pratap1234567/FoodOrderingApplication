package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaServer
@CrossOrigin
public class ProjectServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectServerApplication.class, args);
		System.out.println("Server up on 8761");
	}

}
