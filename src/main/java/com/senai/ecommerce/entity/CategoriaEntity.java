package com.senai.ecommerce.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "Categoria")
public class CategoriaEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
    private Long id;
	private String nome;
	
	@ManyToMany(mappedBy = "categorias")
	private Set<Produto> produtos = new HashSet<>();
	

	public CategoriaEntity() {
	}
	
	public CategoriaEntity(Long id, String nome) {
	 
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	 
	
	
}

