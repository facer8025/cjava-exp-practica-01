package com.cjava.s04_exp_matricula_h2_productor.controller;

import com.cjava.s04_exp_matricula_h2_productor.model.entity.Matricula;
import com.cjava.s04_exp_matricula_h2_productor.service.IMatriculaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/matriculas")
public class MatriculaController {
	private static final Logger log = LoggerFactory.getLogger(MatriculaController.class);
	@Autowired
	private IMatriculaService service;

	@GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
	public String getHealthCheck() {
		return "{ \"todoOk\" : true }";
	}

	@GetMapping("/")
	public List<Matricula> getMatriculas() {
		log.info("getMatriculas");
		return this.service.getAll();
	}

	@GetMapping("/{id}")
	public Matricula getMatricula(@PathVariable Integer id) {
		return this.service.getById(id);
	}

	@PostMapping("/")
	public Matricula addMatricula(@RequestBody Matricula matricula) {
		return this.service.save(matricula);
	}

	@PatchMapping("/{id}")
	public Matricula updateMatricula(@RequestBody Matricula matricula) {
		return this.service.update(matricula);
	}

	@DeleteMapping("/{id}")
	public void deleteMatricula(@PathVariable Integer id) {
		this.service.delete(id);
	}
}
