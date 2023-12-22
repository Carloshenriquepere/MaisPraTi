package com.exercise.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name= "veiculo")
@Data
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String marca;

    private String modelo;

    private Integer ano;

    private String placa;

}
