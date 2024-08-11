package br.com.Exercicio1.loja.repository;
import br.com.Exercicio1.loja.entities.VendasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendasRepository extends JpaRepository <VendasEntity,Long>{
    List<VendasEntity> findByNomeCliente(String nomeCliente);
}
