package br.com.Exercicio1.loja.controller;

import br.com.Exercicio1.loja.entities.ProdutoEntity;
import br.com.Exercicio1.loja.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/cadastrar")
    public ProdutoEntity cadastrar(@RequestBody ProdutoEntity produtoEntity) {
        return produtoService.save(produtoEntity);
    }

    @PutMapping("alterarProduto/{id}")
    public ProdutoEntity editar(@PathVariable Long id) {
        return produtoService.findById(id);
    }

    @DeleteMapping("deletar/{id}")
    public void deletar(@PathVariable Long id) {
        produtoService.deleteById(id);
    }

    @GetMapping("/consultar")
    public List<ProdutoEntity> consultar() {
        return produtoService.findAll();
    }

    @GetMapping("/listar10ProdutosMaisCaros")
    public List<ProdutoEntity> listar10ProdutosMaisCaros() {

        List<ProdutoEntity> lista = produtoService.findAll();
        List<ProdutoEntity> produtosMaisCaros = new ArrayList<>();

        // Loop para encontrar os 10 produtos mais caros
        for (int i = 0; i < 10 && i < lista.size(); i++) {
            ProdutoEntity produtoCaro = null;
            double maiorPreco = 0.0;

            // Encontrar o produto com o maior preço
            for (ProdutoEntity produto : lista) {
                if (produto.getPreco() > maiorPreco) {
                    maiorPreco = produto.getPreco();
                    produtoCaro = produto;
                }
            }

            //lista final
            if (produtoCaro != null) {
                produtosMaisCaros.add(produtoCaro);
            }
        }

        return produtosMaisCaros;
    }
}

