package com.felipealves.cursomc.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipealves.cursomc.Exception.ObjectNotFoundException;
import com.felipealves.cursomc.domain.Pedido;
import com.felipealves.cursomc.repositores.PedidoRepository;

@Service   								/* Camada responsavel por serviço*/
public class PedidoService {

	@Autowired    						/* Instanciar o repositorio*/
	private PedidoRepository repo;
	
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontraddo! id: " + id + ", tipo: " + Pedido.class.getName()
				));
	}
}
