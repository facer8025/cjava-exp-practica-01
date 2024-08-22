package com.cjava.s04_exp_matricula_consumidor.controller;

import com.cjava.s04_exp_matricula_consumidor.model.Matricula;
import com.cjava.s04_exp_matricula_consumidor.service.IMatriculaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/api/matriculas")
public class MatriculaController {

	private static final Logger log = LoggerFactory.getLogger(MatriculaController.class);
	@Autowired
	private IMatriculaService service;

	@Autowired
	private CircuitBreakerFactory cbFactory;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/")
	public List<Matricula> getMatriculas() {
		log.info("consumidor:controlador:get-matriculas");
		return cbFactory.create("cbMatriculas")
				.run(() -> this.service.getAll(), e -> alternativeMethod(e));
	}

	@GetMapping("/{id}")
	public Matricula getMatriculaById(@PathVariable Integer id) {
		log.info("consumidor:controlador:get-matricula-by-id: " + id);
		return this.service.getById(id);
	}

	@PostMapping("/")

	private List<Matricula> alternativeMethod(Throwable e) {
		return restTemplate.getForObject("http://cjava-matricula-respaldo/api/matriculas", List.class);
	}
}
