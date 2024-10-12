package br.com.lumens;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bem vindo ao calculador de partidas rankeadas da Lumens");
        System.out.println("informe o seu nome, o numero de vitorias e derrotas");
        String nome = scan.next();
        Integer vitorias = scan.nextInt();
        Integer derrotas = scan.nextInt();
        Heroi heroi = new Heroi(nome);
        heroi.calcularSaldoVitorias(vitorias, derrotas, heroi);
        heroi.calcularRank(vitorias, heroi);
        System.out.println("O Herói tem de saldo de "+ heroi.getVitorias()+" vitorias, e está no nível de "+ heroi.getRank());
    }
}
