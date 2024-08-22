package com.cjava.s04_exp_matricula_mongo_respaldo.model.repository;

import com.cjava.s04_exp_matricula_mongo_respaldo.model.entity.Matricula;
import org.springframework.data.repository.CrudRepository;

public interface IMatriculaRepository extends CrudRepository<Matricula, Integer> {
}
