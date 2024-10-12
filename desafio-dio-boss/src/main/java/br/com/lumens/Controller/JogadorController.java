package br.com.lumens.Controller;

import br.com.lumens.Domain.Jogador;

public class JogadorController {
    public Integer calcularXp(Jogador jogador, Integer ptsVidaMonstro) {
        Integer XPJogador = jogador.getXPJogador();

        if (XPJogador >= ptsVidaMonstro) {

            Integer xpGanho = ptsVidaMonstro / 2;
            XPJogador += xpGanho;

            System.out.println("MONSTRO DERROTADO COM SUCESSO!" +
                    "\nO XP DO JOGADOR É DE " + XPJogador);
        } else {
            System.out.println("O JOGADOR MORREU!");
        }


        jogador.setXPJogador(XPJogador);


        return XPJogador;
    }
}
