package com.senai.ecommerce.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ItemDoPedidoPK {
	
	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private PedidoEntity pedido;

	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;


	public PedidoEntity getPedido() {
		return pedido;
	}


	public void setPedido(PedidoEntity pedido) {
		this.pedido = pedido;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	
	
}
