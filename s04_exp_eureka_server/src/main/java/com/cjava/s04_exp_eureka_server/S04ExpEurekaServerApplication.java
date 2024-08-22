package com.cjava.s04_exp_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class S04ExpEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04ExpEurekaServerApplication.class, args);
	}

}
