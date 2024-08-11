package br.com.Exercicio1.loja.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="funcionario")
@Table

public class FuncionarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private Integer idade;
    private String endereco;
    private String funcao;

    //Um funcionário para 1 cliente
    @OneToOne
    @JoinColumn(name ="clientes_id")
    private ClienteEntity clientes;
}
