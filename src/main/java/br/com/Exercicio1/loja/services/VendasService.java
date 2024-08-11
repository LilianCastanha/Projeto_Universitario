package br.com.Exercicio1.loja.services;

import br.com.Exercicio1.loja.entities.VendasEntity;
import br.com.Exercicio1.loja.repository.ClienteRepository;
import br.com.Exercicio1.loja.repository.VendasRepository;
import br.com.Exercicio1.loja.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class VendasService {

    @Autowired
    private VendasRepository vendasRepository;

    @Autowired
    private ClienteRepository ClienteRepository;

    @Autowired
    public FuncionarioRepository FuncionarioRepository;


    public VendasEntity save(VendasEntity vendasEntity) {
        return vendasRepository.save(vendasEntity);
    }

    public VendasEntity alterar(VendasEntity vendas, Long id) {

        VendasEntity vendaExistente = vendasRepository.findById(id).orElse(null);


        if (vendaExistente != null) {
            vendaExistente.setNomeCliente(vendas.getNomeCliente());
            // Salva a venda atualizada no banco de dados
            return vendasRepository.save(vendaExistente);
        }

        return null;
    }
    public void delete(Long id) {
        vendasRepository.deleteById(id);
    }

    public VendasEntity findById(Long id) {
        return vendasRepository.findById(id).orElse(null);
    }


    public List<VendasEntity> findByNomeCliente(String nomeCliente) {
        return vendasRepository.findByNomeCliente(nomeCliente);
    }

    public List<VendasEntity> listar10VendasMaisAltas() {

        List<VendasEntity> todasVendas = vendasRepository.findAll();
        List<VendasEntity> vendasMaisAltas = new ArrayList<>();


        for (int i = 0; i < 10 && i < todasVendas.size(); i++) {
            VendasEntity vendaMaisAlta = null;
            double maiorValor = 0.0;


            for (VendasEntity venda : todasVendas) {
                if (venda.getValorTotal() > maiorValor) {
                    maiorValor = venda.getValorTotal();
                    vendaMaisAlta = venda;
                }
            }

            if (vendaMaisAlta != null) {
                vendasMaisAltas.add(vendaMaisAlta);
                todasVendas.remove(vendaMaisAlta);
            }
        }

        return vendasMaisAltas;
    }
}

