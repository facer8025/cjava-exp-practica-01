package com.cjava.s04_exp_matricula_mongo_respaldo.service;

import com.cjava.s04_exp_matricula_mongo_respaldo.model.entity.Matricula;
import com.cjava.s04_exp_matricula_mongo_respaldo.model.repository.IMatriculaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService implements IMatriculaService {

	private static final Logger log = LoggerFactory.getLogger(MatriculaService.class);
	@Autowired
	private IMatriculaRepository repository;

	@Override
	public List<Matricula> getAll() {
		return (List<Matricula>) this.repository.findAll();
	}

	@Override
	public Matricula getById(Integer id) {
		log.info("getMatricula: " + id);
		return this.repository.findById(id).get();
	}

	@Override
	public Matricula save(Matricula matricula) {
		return this.repository.save(matricula);
	}

	@Override
	public Matricula update(Matricula matricula) {
		return this.repository.save(matricula);
	}

	@Override
	public void delete(Integer id) {
		this.repository.deleteById(id);
	}
}
