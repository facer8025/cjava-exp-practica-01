package com.cjava.s04_exp_matricula_mongo_respaldo.service;

import com.cjava.s04_exp_matricula_mongo_respaldo.model.entity.Matricula;

import java.util.List;

public interface IMatriculaService {
	List<Matricula> getAll();
	Matricula getById(Integer id);
	Matricula save(Matricula matricula);
	Matricula update(Matricula matricula);
	void delete(Integer id);
}
