package com.exercise.controller;

import com.exercise.entities.Veiculo;
import com.exercise.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/buscarTodos")
    public List<Veiculo> buscarTodos(){
        return veiculoService.buscarTodos();
    }

    @GetMapping("/buscar/{id}")
    public List<Veiculo> buscarPorId(@PathVariable Integer id){
        return veiculoService.buscarPorId(id);
    }

    @GetMapping("/{modelo}")
    public List<Veiculo> buscaPorNome(@PathVariable String modelo){
        return veiculoService.buscaPorNome(modelo);
    }

    @PostMapping("/salvar")
    public Veiculo salvarVeiculo(@RequestBody Veiculo veiculo){
        return veiculoService.salvarVeiculo(veiculo);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarVeiculo(@PathVariable Integer id){
        this.veiculoService.deletePorId(id);
    }

}
