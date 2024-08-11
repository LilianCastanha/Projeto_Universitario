package br.com.Exercicio1.loja.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="clientes")
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private Integer idade;
    private String endereco;

    //Um cliente para 1 funcionário
    @OneToOne
    @JoinColumn(name= "funcionario_id")
    private FuncionarioEntity funcionario;

}
