package com.ajunior.spring.mvc.dao;

import com.ajunior.spring.mvc.domain.Funcionario;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

	public List<Funcionario> findByName(String nome) {
		return createQuery("select f from Funcionario f where f.nome like concat('%',?1,'%') ", nome);
	}

	@Override
	public List<Funcionario> findByCargoId(Long id) {
		return createQuery("select f from Funcionario f where f.cargo.id=?1", id);
	}

	@Override
	public List<Funcionario> findByDates(LocalDate entrada, LocalDate saida) {
		// Obs.: Pay attention to the use of space at the end of the string before the .append()
		String jpql = new StringBuilder("select f from Funcionario f ")
				.append("where f.dataEntrada >= ?1 and f.dataSaida <= ?2 ")
				.append("order by f.dataEntrada asc")
				.toString();
		return createQuery(jpql, entrada, saida);
	}

	@Override
	public List<Funcionario> findByDateEntry(LocalDate entrada) {
		// Obs.: Pay attention to the use of space at the end of the string before the .append()
		String jpql = new StringBuilder("select f from Funcionario f ")
				.append("where f.dataEntrada = ?1 ")
				.append("order by f.dataEntrada asc")
				.toString();
		return createQuery(jpql, entrada);
	}

	@Override
	public List<Funcionario> findByDateExit(LocalDate saida) {
		// Obs.: Pay attention to the use of space at the end of the string before the .append()
		String jpql = new StringBuilder("select f from Funcionario f ")
				.append("where f.dataSaida = ?1 ")
				.append("order by f.dataEntrada asc")
				.toString();
		return createQuery(jpql, saida);
	}
	
}
