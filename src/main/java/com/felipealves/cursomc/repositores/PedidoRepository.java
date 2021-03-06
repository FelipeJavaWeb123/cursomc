package com.felipealves.cursomc.repositores; /*Pacote responsavel pela comunicação com o banco de dados*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipealves.cursomc.domain.Pedido;

@Repository      /* Anotison resonsavel por relacionar a interface com o banco*/
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
