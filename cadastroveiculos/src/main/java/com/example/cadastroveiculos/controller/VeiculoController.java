package com.example.cadastroveiculos.controller;
import com.example.cadastroveiculos.model.Veiculo;
import com.example.cadastroveiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoRepository veiculoRepository;
    @GetMapping
    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.findAll();
    }
    @PostMapping
    public Veiculo criarVeiculo(@RequestBody Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }
}
