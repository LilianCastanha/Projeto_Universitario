package br.com.Exercicio1.loja.services;

import br.com.Exercicio1.loja.entities.ProdutoEntity;
import br.com.Exercicio1.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoEntity save(ProdutoEntity produtoEntity) {
        return produtoRepository.save(produtoEntity);
    }

    public ProdutoEntity findById(Long id) {
        return produtoRepository.findById(id).get();
    }

    public void deleteById(Long id) {
         produtoRepository.deleteById(id);
    }

    public List<ProdutoEntity> findAll() {
        return produtoRepository.findAll();
    }
}
