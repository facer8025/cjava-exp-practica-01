package com.cjava.s04_exp_matricula_h2_productor.service;

import com.cjava.s04_exp_matricula_h2_productor.model.entity.Matricula;
import com.cjava.s04_exp_matricula_h2_productor.model.repository.IMatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService implements IMatriculaService {
	@Autowired
	private IMatriculaRepository repository;

	@Override
	public List<Matricula> getAll() {
		return (List<Matricula>) this.repository.findAll();
	}

	@Override
	public Matricula getById(Integer id) {
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
