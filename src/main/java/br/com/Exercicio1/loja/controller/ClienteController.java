package br.com.Exercicio1.loja.controller;

import br.com.Exercicio1.loja.entities.ClienteEntity;
import br.com.Exercicio1.loja.entities.ProdutoEntity;
import br.com.Exercicio1.loja.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/cadastrar")
    public ClienteEntity cadastrar(@RequestBody ClienteEntity clienteEntity) {
        return clienteService.save(clienteEntity);
    }

    @PutMapping("alterar/{id}")
    public ClienteEntity editar(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @GetMapping("/findAll")
    public List<ClienteEntity> findAll() {
        return clienteService.findAll();
    }

    @GetMapping("/idade")
    public List<ClienteEntity> buscarPorIdade() {
        return clienteService.buscarPorIdade();
    }
}


