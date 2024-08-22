package com.cjava.expert.controlleres;

import com.cjava.expert.modelo.entidades.Matricula;
import com.cjava.expert.modelo.servicios.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatriculaController {

	@Qualifier("matriculaServiceFeign")
	@Autowired
	private IMatriculaService service;

	@RequestMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
	public String getHealthCheck()	{
		return "{ \"todoOk\" : true }";
	}

	@GetMapping("/api/matriculas")
	public List<Matricula> getAll() {
		return (List<Matricula>) this.service.getAll();
	}

}
