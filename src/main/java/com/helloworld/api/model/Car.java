package com.helloworld.api.model;

import com.helloworld.api.dto.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {

    public Car (CarDTO data) {
        this.modelo = data.modelo();
        this.fabricante = data.fabricante();
        this.dataFabricacao = data.dataFabricacao();
        this.valor = data.valor();
        this.anoModelo = data.anoModelo();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, nullable = false)
    private String modelo;

    @Column(length = 50, nullable = false)
    private String fabricante;

    @Column(length = 10, nullable = false)
    private String dataFabricacao;

    private double valor;
    private int anoModelo;
}
