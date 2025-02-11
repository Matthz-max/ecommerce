package com.senai.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.ecommerce.dto.ProdutoDTO;
import com.senai.ecommerce.services.ProdutoService;

	@RestController
	@RequestMapping("/produtos")
	public class ProdutoController {

	    @Autowired
	    private ProdutoService produtoService;

	    // Método GET para buscar todos os produtos
	    @GetMapping
	    public ResponseEntity<List<ProdutoDTO>> buscarTodos() {
	        List<ProdutoDTO> produtos = produtoService.buscarTodos();
	        return new ResponseEntity<>(produtos, HttpStatus.OK);
	    }

	    // Método GET para buscar produtos por página
	    @GetMapping("/pagina")
	    public ResponseEntity<Page<ProdutoDTO>> buscarPagina(Pageable pagina) {
	        Page<ProdutoDTO> produtos = produtoService.buscarPagina(pagina);
	        return new ResponseEntity<>(produtos, HttpStatus.OK);
	    }
 
	    @PostMapping
	    public ResponseEntity<ProdutoDTO> criar(@RequestBody ProdutoDTO produtoDTO) {
	        if (produtoDTO.getPreco() == null) {
	            produtoDTO.setPreco(0.0);
	        }
	        ProdutoDTO novoProduto = produtoService.criar(produtoDTO);
	        return ResponseEntity.ok(novoProduto);
	    }
  
}