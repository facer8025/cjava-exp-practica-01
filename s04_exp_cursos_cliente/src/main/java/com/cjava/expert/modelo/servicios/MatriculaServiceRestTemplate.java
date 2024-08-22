package com.cjava.expert.modelo.servicios;

import com.cjava.expert.modelo.entidades.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("matriculaServiceRestTemplate")
public class MatriculaServiceRestTemplate implements IMatriculaService {

	@Autowired
	RestTemplate clienteRest;

	@Override
	public List<Matricula> getAll() {
		return this.clienteRest.getForObject("http://cjava-matricula/api/matriculas", List.class);
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
