package com.senai.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecommerce.entity.Produto;

public interface CategoriaInterface extends JpaRepository<Long, Produto> {

}
