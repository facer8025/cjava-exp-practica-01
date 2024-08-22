package com.cjava.expert.modelo.servicios;

import com.cjava.expert.clientes.MatriculaClienteRest;
import com.cjava.expert.modelo.entidades.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("matriculaServiceFeign")
public class MatriculaServiceOpenFeign implements IMatriculaService {
	@Autowired
	public MatriculaClienteRest matriculaFeign;

	@Override
	public List<Matricula> getAll() {
		return this.matriculaFeign.getAll();
	}

	@Override
	public Matricula getById(Integer vchMatCodigo) {
		return null;
	}

	@Override
	public Matricula save(Matricula matricula) {
		return null;
	}

	@Override
	public Matricula update(Matricula matricula) {
		return null;
	}

	@Override
	public void delete(Integer vchMatCodigo) {

	}
}
