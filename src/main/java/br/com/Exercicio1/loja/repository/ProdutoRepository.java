package br.com.Exercicio1.loja.repository;

import br.com.Exercicio1.loja.entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
