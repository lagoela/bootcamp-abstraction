package com.lagoela.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    private LocalDate dataDeInicio;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(LocalDate dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataDeInicio=" + dataDeInicio +
                '}';
    }
}
