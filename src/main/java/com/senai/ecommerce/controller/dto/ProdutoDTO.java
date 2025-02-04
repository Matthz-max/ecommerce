package com.senai.ecommerce.controller.dto;

public record ProdutoDTO(Long id,String nome,String descricao,
		Double preco,String imgUrl) {
	
}
