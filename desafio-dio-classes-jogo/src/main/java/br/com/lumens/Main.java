package br.com.lumens;

import java.util.Scanner;

public class Main {
    private static Tipo tipo = new Tipo();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo do LumensGame");
        System.out.println("Informe o nome e a idade para cadastro!");
        String nome = scan.next();
        Integer idade = scan.nextInt();
        Heroi heroi = new Heroi(nome, idade);
        tipo.imprimirTipos();
        System.out.println("Escolha um dos tipos acima pelo index:");
        Integer index = scan.nextInt();
        tipo.escolhendoTipo(index, heroi);
        System.out.println("O " + heroi.getTipo().getNome()+ " de nome " + heroi.getNome()+ " usou um "+ heroi.getTipo().getAtaque());
    }
}
