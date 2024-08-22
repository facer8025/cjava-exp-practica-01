package com.cjava.s04_exp_matricula_mongo_respaldo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class S04ExpMatriculaMongoRespaldoApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04ExpMatriculaMongoRespaldoApplication.class, args);
	}

}
