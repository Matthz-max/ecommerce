package com.senai.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecommerce.entity.CategoriaEntity;

public interface CategoriaInterface extends JpaRepository<CategoriaEntity, Long> {

}
