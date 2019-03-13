package com.felipealves.cursomc.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipealves.cursomc.Exception.ObjectNotFoundException;
import com.felipealves.cursomc.domain.Cliente;
import com.felipealves.cursomc.repositores.ClienteRepository;

@Service   /* Camada responsavel por serviço*/
public class ClienteService {

	@Autowired    /* Instanciar o repositorio*/
	private ClienteRepository repo;
	
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontraddo! id: " + id + ", tipo: " + Cliente.class.getName()
				));
	}
}
