package br.com.Exercicio1.loja.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name= "vendas")
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class VendasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCliente;
    private String funcionario;
    private String produtosVendidos;
    private String observacoes;
    private double valorTotal;

}
