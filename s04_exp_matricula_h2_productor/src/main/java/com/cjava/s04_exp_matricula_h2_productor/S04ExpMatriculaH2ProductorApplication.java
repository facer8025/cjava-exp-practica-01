package com.cjava.s04_exp_matricula_h2_productor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class S04ExpMatriculaH2ProductorApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04ExpMatriculaH2ProductorApplication.class, args);
	}

}
