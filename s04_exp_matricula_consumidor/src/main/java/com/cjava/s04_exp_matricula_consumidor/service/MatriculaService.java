package com.cjava.s04_exp_matricula_consumidor.service;

import com.cjava.s04_exp_matricula_consumidor.model.Matricula;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("matriculaClientService")
public class MatriculaService implements IMatriculaService{

	private static final Logger log = LoggerFactory.getLogger(MatriculaService.class);
	@Autowired
	private RestTemplate matriculaClientRest;

	@Override
	public List<Matricula> getAll() {
		log.info("service:getAll");
		return this.matriculaClientRest.getForObject("http://cjava-matricula/api/matriculas", List.class);
	}

	@Override
	public Matricula getById(Integer id) {
		log.info("consumidor:service:getById: " + id);
		return this.matriculaClientRest.getForObject("http://cjava-matricula/api/matriculas/" + id, Matricula.class);
	}

	@Override
	public Matricula save(Matricula matricula) {
		return this.matriculaClientRest.getForObject("http://cjava-matricula/api/matriculas", Matricula.class);
	}

	@Override
	public Matricula update(Matricula matricula) {
		return this.matriculaClientRest.getForObject("http://cjava-matricula/api/matriculas", Matricula.class);
	}

	@Override
	public void delete(Integer id) {
		this.matriculaClientRest.getForObject("http://cjava-matricula/api/matriculas/" + id, String.class);
	}
}
