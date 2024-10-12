package br.com.lumens.Domain;

public class Jogador {
    private String name;
    private Integer XPJogador;

    public Jogador(String name, Integer XPJogador) {
        this.name = name;
        this.XPJogador = XPJogador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getXPJogador() {
        return XPJogador;
    }

    public void setXPJogador(Integer XPJogador) {
        this.XPJogador = XPJogador;
    }
}
