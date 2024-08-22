package com.cjava.s04_exp_matricula_h2_productor.model.repository;

import com.cjava.s04_exp_matricula_h2_productor.model.entity.Matricula;
import org.springframework.data.repository.CrudRepository;

public interface IMatriculaRepository extends CrudRepository<Matricula, Integer> {
}
