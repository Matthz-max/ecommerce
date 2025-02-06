package com.senai.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecommerce.entity.PedidoEntity;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {

}
