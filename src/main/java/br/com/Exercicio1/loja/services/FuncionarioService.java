package br.com.Exercicio1.loja.services;

import br.com.Exercicio1.loja.entities.FuncionarioEntity;
import br.com.Exercicio1.loja.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioEntity salvarFuncionario (FuncionarioEntity funcionarioEntity) {
    return funcionarioRepository.save(funcionarioEntity);
    }

    public List <FuncionarioEntity> findAll() {
        return funcionarioRepository.findAll();

    }
    public FuncionarioEntity findById(Long id) {
        return funcionarioRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        funcionarioRepository.deleteById(id);
    }
}

