package com.helloworld.api.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Car {
    private Long id;
    private String modelo;
    private String fabricante;
    private String dataFabricacao;
    private int valor;
    private int anoModelo;
}
