package com.cjava.expert.clientes;

import com.cjava.expert.modelo.entidades.Matricula;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "servicio-matriculas")
public interface MatriculaClienteRest {

	@GetMapping("api/matriculas")
	public List<Matricula> getAll();

}
