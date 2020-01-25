package com.ajunior.spring.mvc.dao;

import com.ajunior.spring.mvc.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
