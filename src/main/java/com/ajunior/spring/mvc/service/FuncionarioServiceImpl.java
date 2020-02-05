package com.ajunior.spring.mvc.service;

import com.ajunior.spring.mvc.dao.FuncionarioDao;
import com.ajunior.spring.mvc.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// NOTE: Reversing use of annotation @Transactional
@Service @Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioDao dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Funcionario funcionario) {
        dao.save(funcionario);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Funcionario funcionario) {
        dao.update(funcionario);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Funcionario buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Funcionario> buscarTodos() {
        return dao.findAll();
    }

	@Override
	public List<Funcionario> buscarPorNome(String nome) {
		return dao.findByName(nome);
	}

	@Override
	public List<Funcionario> buscarPorCargoId(Long id) {
		return dao.findByCargoId(id);
	}
}
