package com.senai.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Usuario")

public class UsuarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private String roles;
	
	public UsuarioEntity() {
 
	}
	
	public UsuarioEntity(Long id, String nome, String email, String telefone, String senha, String roles) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.roles = roles;
	}
	
	

}
