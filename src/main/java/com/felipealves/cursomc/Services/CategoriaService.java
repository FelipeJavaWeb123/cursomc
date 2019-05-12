package com.felipealves.cursomc.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipealves.cursomc.Exception.ObjectNotFoundException;
import com.felipealves.cursomc.domain.Categoria;
import com.felipealves.cursomc.repositores.CategoriaRepository;

@Service   /* Camada responsavel por serviço*/
public class CategoriaService {

	@Autowired    /* Instanciar o repositorio*/
	private CategoriaRepository repo;
	
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontraddo! id: " + id + ", tipo: " + Categoria.class.getName()
				));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}
}
