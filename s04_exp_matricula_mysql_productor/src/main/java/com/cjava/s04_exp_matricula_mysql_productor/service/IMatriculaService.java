package com.cjava.s04_exp_matricula_mysql_productor.service;

import com.cjava.s04_exp_matricula_mysql_productor.model.entity.Matricula;

import java.util.List;

public interface IMatriculaService {
	List<Matricula> getAll();
	Matricula getById(Integer id);
	Matricula save(Matricula matricula);
	Matricula update(Matricula matricula);
	void delete(Integer id);
}
