package com.ajunior.spring.mvc.dao;

import com.ajunior.spring.mvc.domain.Funcionario;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

	public List<Funcionario> findByName(String nome) {
		return createQuery("select f from Funcionario f where f.nome like concat('%',?1,'%') ", nome);
	}
	
}
