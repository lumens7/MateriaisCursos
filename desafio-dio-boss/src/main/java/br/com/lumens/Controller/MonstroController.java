package br.com.lumens.Controller;

import br.com.lumens.Domain.Jogador;
import br.com.lumens.Domain.Monstro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MonstroController {
    public static List<Monstro> monstros = new ArrayList<>();
    public static List<Monstro> monstrosSorteados = new ArrayList<>();
    public void criarMonstros(){
        Monstro javali = new Monstro("javali", 200);
        monstros.add(javali);
        Monstro goblin = new Monstro("goblin", 400);
        monstros.add(goblin);
        Monstro goblinBombado = new Monstro("Goblin Bonbado", 500);
        monstros.add(goblinBombado);
        Monstro troll = new Monstro("Troll", 1000);
        Monstro golemPedra = new Monstro("Golem de Pedra", 1500);
        monstros.add(golemPedra);
        Monstro lobisomen = new Monstro("Lobisomen", 2000);
        monstros.add(lobisomen);
        Monstro gosma = new Monstro("Gosma", 2500);
        monstros.add(gosma);
        Monstro manticora = new Monstro("Mantícora", 3000);
        monstros.add(manticora);
        Monstro golenAgua = new Monstro("Golem de agua", 3500);
        monstros.add(golenAgua);
        Monstro fomoriano = new Monstro("Fomoriano", 4000);
        monstros.add(fomoriano);
        Monstro vampiro = new Monstro("vampiro", 4500);
        monstros.add(vampiro);
        Monstro elementalAr = new Monstro("Elemental de Ar", 5000);
        monstros.add(elementalAr);
        Monstro kraken = new Monstro("Kraken", 5500);
        monstros.add(kraken);
        Monstro fenix = new Monstro("Fênix", 6000);
        monstros.add(fenix);
        Monstro quimera = new Monstro("Quimera", 6500);
        monstros.add(quimera);
        Monstro basilisco = new Monstro("Basilisco", 7000);
        monstros.add(basilisco);
        Monstro harpia = new Monstro("Harpia", 7500);
        monstros.add(harpia);
        Monstro dragaoTerra = new Monstro("Dragão de terra", 8000);
        monstros.add(dragaoTerra);
        Monstro grifo = new Monstro("Grifo", 8500);
        monstros.add(grifo);
        Monstro minotauro = new Monstro("Minotauro", 9000);
        monstros.add(minotauro);
        Monstro dragaoFogo = new Monstro("dragão de fogo", 9500);
        monstros.add(dragaoFogo);
        Monstro dragaoScarlate = new Monstro("Dragão Scarlate", 10000);
        monstros.add(dragaoScarlate);
        Monstro oni = new Monstro("Oni", 12000);
        monstros.add(oni);
        Monstro semiDeus = new Monstro("Semi-Deus", 20000);
        monstros.add(semiDeus);
    }

    public List<Monstro> sortearMonstros() {

        if (monstros.isEmpty()) {
            criarMonstros();
        }
        Collections.shuffle(monstros);

        monstrosSorteados.add(monstros.get(0));
        monstrosSorteados.add(monstros.get(1));
        monstrosSorteados.add(monstros.get(2));

        System.out.println(monstrosSorteados.get(0));
        System.out.println(monstrosSorteados.get(1));
        System.out.println(monstrosSorteados.get(2));


        return monstrosSorteados;
    }

    public void limparLista(){
        monstrosSorteados.removeAll(monstros);
    }
    public void lutarComMonstro(Integer index, Jogador jogador) {

        if (monstrosSorteados == null || monstrosSorteados.isEmpty()) {
            System.out.println("Nenhum monstro foi sorteado.");
            return;
        }


        if (index < 0 || index >= monstrosSorteados.size()) {
            System.out.println("Índice inválido.");
            return;
        }


        Monstro monstroEscolhido = monstrosSorteados.get(index);


        JogadorController jogadorController = new JogadorController();
        jogadorController.calcularXp(jogador, monstroEscolhido.getPtsVida());


        limparLista();
    }

}
