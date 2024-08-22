package com.cjava.expert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name="servicio-matriculas")
@EnableFeignClients
@SpringBootApplication
public class S04ExpMatriculasClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04ExpMatriculasClienteApplication.class, args);
	}

}
