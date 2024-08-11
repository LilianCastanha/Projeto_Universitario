package br.com.Exercicio1.loja.controller;

import br.com.Exercicio1.loja.entities.FuncionarioEntity;
import br.com.Exercicio1.loja.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    //Anotacao de dependencias
    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("/cadastrar")
    public FuncionarioEntity salvarFuncionario (@RequestBody FuncionarioEntity funcionarioEntity){
        return funcionarioService.salvarFuncionario(funcionarioEntity);
    }

    @PutMapping("alterar/{id}")
    public FuncionarioEntity findById(@PathVariable Long id){
        return funcionarioService.findById(id);
    }

    @DeleteMapping("deletar/{id}")
    public void deletarFuncionario(@PathVariable Long id){
        funcionarioService.deleteById(id);
    }

    @GetMapping("/findAll")
      public List<FuncionarioEntity> findAll(){
        return funcionarioService.findAll();

    }

    }


