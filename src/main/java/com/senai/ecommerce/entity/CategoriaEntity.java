package com.senai.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Categoria")
public class CategoriaEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
    private Long id;
	private String nome;

	public CategoriaEntity() {
	}
	
	public CategoriaEntity(Long id, String nome) {
	 
		this.id = id;
		this.nome = nome;
	}
	 
	
	
}

