package com.exercise.service;

import com.exercise.entities.Veiculo;
import com.exercise.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;


   public List<Veiculo> buscarTodos(){
       return this.veiculoRepository.findAll();
   }

   public Veiculo salvarVeiculo(Veiculo veiculo){
       return this.veiculoRepository.save(veiculo);
   }

   public void deletePorId(Integer id){
       this.veiculoRepository.deleteById(id);

   }

    public List<Veiculo> buscarPorId(Integer id) {
       return this.veiculoRepository.findAllById(Collections.singleton(id));
    }

    public List<Veiculo> buscaPorNome(String modelo) {
       return this.veiculoRepository.findAll()
               .stream()
               .filter(veiculo -> veiculo.getModelo().equalsIgnoreCase(modelo))
               .collect(Collectors.toList());
    }

}