package com.senai.ecommerce.entity;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import com.senai.ecommerce.enums.StatusDoPedido;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pedido")

public class PedidoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant momento;
	private StatusDoPedido status;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private UsuarioEntity cliente;

	@OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
	private PagamentoEntity pagamento;

	@OneToMany(mappedBy = "id.pedido")
	private Set<ItemDoPedidoEntity> items = new HashSet<>();

	public PedidoEntity() {
	}

	public PedidoEntity(Long id, Instant momento, StatusDoPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

}
