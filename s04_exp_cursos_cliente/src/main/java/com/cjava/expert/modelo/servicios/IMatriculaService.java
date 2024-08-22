package com.cjava.expert.modelo.servicios;

import com.cjava.expert.modelo.entidades.Matricula;

import java.util.List;

public interface IMatriculaService {
	List<Matricula> getAll();
	Matricula getById(Integer vchMatCodigo);
	Matricula save(Matricula matricula);
	Matricula update(Matricula matricula);
	void delete(Integer vchMatCodigo);
}
