package com.senai.ecommerce.entity;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pagamento")

public class PagamentoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private Instant momento;
	
	@OneToOne
	@MapsId
	private PedidoEntity pedido;

	
	public PagamentoEntity( ) {  
	}
	
	public PagamentoEntity(Long id, Instant momento) {	
		this.id = id;
		this.momento = momento;
	}
	
	

}
