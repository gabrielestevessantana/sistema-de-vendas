package com.projeto.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.sistema.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	

}
