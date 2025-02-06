package com.senai.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecommerce.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<Long, UsuarioEntity>{

}
