package br.com.lumens;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        minhaLista.add("Teste1");
        minhaLista.add("Teste2");
        minhaLista.add("Teste3");
        minhaLista.add("Teste4");

        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.get(2));
        System.out.println(minhaLista.get(3));

        System.out.println(minhaLista);

        System.out.println(minhaLista.remove(3));

        System.out.println(minhaLista);
    }
}
