package com.cjava.s04_exp_matricula_mysql_productor.controller;

import com.cjava.s04_exp_matricula_mysql_productor.model.entity.Matricula;
import com.cjava.s04_exp_matricula_mysql_productor.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/matriculas")
public class MatriculaController {

	@Autowired
	private IMatriculaService service;

	@GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
	public String getHealthCheck() {
		return "{ \"todoOk\" : true }";
	}

	@GetMapping("/")
	public List<Matricula> getListMatriculas() {
		return this.service.getAll();
	}

	@GetMapping("/{id}")
	public Matricula getMatricula(@PathVariable Integer id) {
		return this.service.getById(id);
	}

	@PostMapping("/")
	public Matricula addMatricula(@RequestBody Matricula matricula) {
		Matricula newMatricula = new Matricula();
		try {
			newMatricula = this.service.save(matricula);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return newMatricula;
	}

	@PatchMapping("/")
	public Matricula updateMatricula(@RequestBody Matricula matricula) {
		Matricula newMatricula = new Matricula();
		try {
			newMatricula = this.service.update(matricula);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return newMatricula;
	}

	@DeleteMapping("/{id}")
	public void deleteMatricula(@PathVariable Integer id) {
		this.service.delete(id);
	}

}
