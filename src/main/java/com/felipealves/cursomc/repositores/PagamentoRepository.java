package com.felipealves.cursomc.repositores; /*Pacote responsavel pela comunicação com o banco de dados*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipealves.cursomc.domain.Pagamento;

@Repository      /* Anotison resonsavel por relacionar a interface com o banco*/
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
