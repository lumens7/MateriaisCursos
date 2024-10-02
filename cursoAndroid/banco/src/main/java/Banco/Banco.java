package Banco;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {

    private String nome;
    private int cnpj;

    public Banco(String nome, int cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
}
