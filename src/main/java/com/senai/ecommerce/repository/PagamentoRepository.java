package com.senai.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecommerce.entity.PagamentoEntity;

public interface PagamentoRepository extends JpaRepository<PagamentoEntity,Long>{
	
}