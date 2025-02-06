package com.senai.ecommerce.entity;

import java.time.Instant;

import com.senai.ecommerce.enums.StatusDoPedido;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pedido")

public class PedidoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private Instant momento;
	private StatusDoPedido status;

	
	
	public PedidoEntity() {	
	}
	
	public PedidoEntity(Long id, Instant momento, StatusDoPedido status) {	 
		this.id = id;
		this.momento = momento;
		this.status = status;
	}
	
	
	 
	
	

	
	
}
