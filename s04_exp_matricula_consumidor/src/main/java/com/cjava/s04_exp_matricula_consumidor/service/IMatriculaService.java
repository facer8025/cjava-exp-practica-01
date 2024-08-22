package com.cjava.s04_exp_matricula_consumidor.service;

import com.cjava.s04_exp_matricula_consumidor.model.Matricula;

import java.util.List;

public interface IMatriculaService {
	List<Matricula> getAll();
	Matricula getById(Integer vchMatCodigo);
	Matricula save(Matricula matricula);
	Matricula update(Matricula matricula);
	void delete(Integer vchMatCodigo);
}
