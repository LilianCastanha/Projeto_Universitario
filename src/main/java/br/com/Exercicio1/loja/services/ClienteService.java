package br.com.Exercicio1.loja.services;

import br.com.Exercicio1.loja.entities.ClienteEntity;
import br.com.Exercicio1.loja.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteEntity save(ClienteEntity clienteEntity) {
        return clienteRepository.save(clienteEntity);
    }

    public List<ClienteEntity> findAll() {
        return clienteRepository.findAll();
    }
    public List <ClienteEntity> buscarPorIdade() {
        List <ClienteEntity> buscarPorIdade = new ArrayList<>();
        for (ClienteEntity cliente : clienteRepository.findAll()) {
            if (cliente.getIdade() >= 18 && cliente.getIdade() <= 35) {
                buscarPorIdade.add(cliente);
            }
        }
    return buscarPorIdade;
    }

    public ClienteEntity findById(Long id) {
        return clienteRepository.findById(id).get();
    }


}
