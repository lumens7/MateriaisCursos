package br.com.lumens;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data = LocalDate.now();
    public Mentoria(){}

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
    }


    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
