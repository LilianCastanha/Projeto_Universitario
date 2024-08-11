package br.com.Exercicio1.loja.repository;

import br.com.Exercicio1.loja.entities.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity,Long> {

}
