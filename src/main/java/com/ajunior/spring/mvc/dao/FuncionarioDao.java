package com.ajunior.spring.mvc.dao;

import com.ajunior.spring.mvc.domain.Funcionario;

import java.time.LocalDate;
import java.util.List;

public interface FuncionarioDao {

    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();

	List<Funcionario> findByName(String nome);

	List<Funcionario> findByCargoId(Long id);

	List<Funcionario> findByDates(LocalDate entrada, LocalDate saida);

	List<Funcionario> findByDateEntry(LocalDate entrada);

	List<Funcionario> findByDateExit(LocalDate saida);
}
