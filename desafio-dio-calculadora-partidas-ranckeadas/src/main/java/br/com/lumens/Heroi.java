package br.com.lumens;

public class Heroi {
    private String nome;
    private String rank;
    private Integer vitorias;
    private Integer derrotas;

    public Heroi(String nome) {
        this.nome = nome;
    }

    public void calcularRank(Integer vitorias, Heroi heroi){
        if(vitorias<=10){
            heroi.setRank("Ferro");
        } else if (vitorias >=11 && vitorias <=20) {
            heroi.setRank("Bronze");
        }else if (vitorias >=21 && vitorias <= 50) {
            heroi.setRank("Prata");
        }else if (vitorias >=51 && vitorias <= 80) {
            heroi.setRank("Ouro");
        }else if (vitorias >=81 && vitorias <= 90) {
            heroi.setRank("Diamante");
        }else if (vitorias >=91 && vitorias <=100) {
            heroi.setRank("Lendário");
        }else if (vitorias >=101 ) {
            heroi.setRank("Imortal");
        }
    }
    public void calcularSaldoVitorias(Integer vitorias, Integer derrotas, Heroi heroi){
        vitorias -= derrotas;
        heroi.setVitorias(vitorias);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "nome='" + nome + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
