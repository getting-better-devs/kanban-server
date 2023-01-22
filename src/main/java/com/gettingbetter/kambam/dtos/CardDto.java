package com.gettingbetter.kambam.dtos;

import jakarta.validation.constraints.NotBlank;

public class CardDto {
    @NotBlank
    private String titulo;
    @NotBlank
    private String subTitulo;
    @NotBlank
    private String subtasks; //lista


    public String getTitulo() { return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(String subtasks) {
        this.subtasks = subtasks;
    }
}
