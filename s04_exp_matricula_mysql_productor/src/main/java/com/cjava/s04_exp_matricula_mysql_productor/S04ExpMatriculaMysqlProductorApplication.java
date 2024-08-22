package com.cjava.s04_exp_matricula_mysql_productor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class S04ExpMatriculaMysqlProductorApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04ExpMatriculaMysqlProductorApplication.class, args);
	}

}
