package br.com.lumens.Domain;

public class Monstro {
    private String name;
    private Integer ptsVida;

    public Monstro(String name, Integer ptsVida) {
        this.name = name;
        this.ptsVida = ptsVida;
    }

    public Monstro(Monstro monstro) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPtsVida() {
        return ptsVida;
    }

    public void setPtsVida(Integer ptsVida) {
        this.ptsVida = ptsVida;
    }

    @Override
    public String toString() {
        return "Monstro{" +
                "name='" + name + '\'' +
                ", ptsVida=" + ptsVida +
                '}';
    }
}
