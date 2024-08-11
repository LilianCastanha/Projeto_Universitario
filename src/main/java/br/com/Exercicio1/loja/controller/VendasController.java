package br.com.Exercicio1.loja.controller;

import br.com.Exercicio1.loja.entities.VendasEntity;
import br.com.Exercicio1.loja.services.VendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendasController {

    @Autowired
    private VendasService vendasService;

    @PostMapping("/save")
    public VendasEntity save(@RequestBody VendasEntity vendas) {
        return vendasService.save(vendas);
    }
    @PutMapping("alterar/{id}")
    public VendasEntity alterar(@RequestBody VendasEntity vendas, @PathVariable Long id) {
        return vendasService.alterar(vendas, id);
    }
    @DeleteMapping("deletar/{id}")
    public void delete(@PathVariable Long id) {
        vendasService.delete(id);
    }
    @GetMapping("findById/{id}")
    public VendasEntity findById(@PathVariable Long id) {
        return vendasService.findById(id);
    }
    @GetMapping("findByNomeCliente")
    public List<VendasEntity> findByNomeCliente(@RequestParam String cliente) {
        return vendasService.findByNomeCliente(cliente);
    }
    @GetMapping("/listarTotal10VendasMaisAltas")
    public List<VendasEntity> listar10VendasMaisAltas() {
        return vendasService.listar10VendasMaisAltas();
    }
}
