package com.felipealves.cursomc.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipealves.cursomc.domain.Categoria;
import com.felipealves.cursomc.repositores.CategoriaRepository;

@Service   /* Camada responsavel por serviço*/
public class CategoriaService {

	@Autowired    /* Instanciar o repositorio*/
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}