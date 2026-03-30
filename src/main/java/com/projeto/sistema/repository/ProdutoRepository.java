package com.projeto.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.sistema.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	

}
