package com.senai.ecommerce.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido_item")
public class ItemDoPedidoEntity {
	
	
	@EmbeddedId
	private ItemDoPedidoPK id = new ItemDoPedidoPK();
	
	private Integer quantidade;
	private Double preco;
	

	public ItemDoPedidoEntity( ) {
	}
	
	
	public ItemDoPedidoEntity(PedidoEntity pedido, Produto produto, Integer quantidade, Double preco) {
		id.setPedido(pedido);
		id.setProduto(produto);
		this.quantidade = quantidade;
		this.preco = preco;
	}
	

	public PedidoEntity getPedido() {
		return id.getPedido();
	}
	
	public void setPedido(PedidoEntity  pedido) {
		id.setPedido(pedido);
	}
	
	public Produto getProduto() {
		return id.getProduto();
	}
	
	public void setProduto(Produto produto) {
		 id.setProduto(produto);
	}
   
	
	

}
