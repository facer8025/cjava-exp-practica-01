package com.cjava.s04_exp_matricula_mongo_respaldo.controller;

import com.cjava.s04_exp_matricula_mongo_respaldo.model.entity.Matricula;
import com.cjava.s04_exp_matricula_mongo_respaldo.service.MatriculaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

	private static final Logger log = LoggerFactory.getLogger(MatriculaController.class);
	@Autowired
	private MatriculaService service;

	@GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
	public String getHealthCheck() {
		return "{ \"todoOk\" : true }";
	}

	@GetMapping("/")
	public List<Matricula> getListMatriculas() {
		return (List<Matricula>) this.service.getAll();
	}

	@GetMapping("/{id}")
	public Matricula getMatricula(@PathVariable Integer id) {
		log.info("getMatricula: " + id);
		var matricula = new Matricula();
		try {
			matricula = this.service.getById(id);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return matricula;
	}

	@PostMapping("/")
	public Matricula addMatricula(@RequestBody Matricula matricula) {
		var newMatricula = new Matricula();
		try {
			newMatricula = this.service.save(matricula);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return newMatricula;
	}

	@PatchMapping("/")
	public Matricula updateMatricula(@RequestBody Matricula matricula) {
		return this.service.update(matricula);
	}

	@DeleteMapping("/{id}")
	public void deleteMatricula(@PathVariable Integer id) {
		this.service.delete(id);
	}
}
