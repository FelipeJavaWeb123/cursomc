package com.felipealves.cursomc.DTO;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.felipealves.cursomc.domain.Cliente;

public class ClienteDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;

	@NotEmpty(message="Preenchimento Obrigatorio")
	@Length(min=5 , max=80 , message="O valor é fora do padrao")
	private String nome;
	
	@NotEmpty(message="Preenchimento Obrigatorio")
	@Length(min=5 , max=80 , message="O valor é fora do padrao")
	private String email;
	
	public Integer getId() {
		return id;
	}

	public ClienteDTO(Cliente obj) {
		this.id = obj.getId();
		this.nome  = obj.getNome();
		this.email = obj.getEmail();
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ClienteDTO() {
	}
}
