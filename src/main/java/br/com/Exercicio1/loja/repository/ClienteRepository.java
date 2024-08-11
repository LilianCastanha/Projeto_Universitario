package br.com.Exercicio1.loja.repository;

import br.com.Exercicio1.loja.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <ClienteEntity, Long>{
}
