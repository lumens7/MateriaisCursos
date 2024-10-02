package br.com.lumens;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha uma opção\n" +
                "\t1-Equals e hashCode\n" +
                "\t2-Queue\n" +
                "\t3- List\n" +
                "\t4- HashSet\n" +
                "\t5- HashMap");
        int resposta = s.nextInt();
        if(resposta == 1) equalsHashCode();
        else if (resposta == 2) queue();
        else if (resposta ==3) lista();
        else if (resposta == 4) hashSet();
        else if (resposta ==5) hashMap();

    }

    public static void queue(){
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Fiat"));
        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);


        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

    }

    public static void equalsHashCode(){
        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new Carro("Chevrollet"));
        listaCarro.add(new Carro("Volkswagen"));

        System.out.println(listaCarro.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));

    }
    public static void lista(){
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Chevrollet"));

        System.out.println(listaCarros);

        System.out.println(listaCarros.contains(new Carro("Ford")));

        //System.out.println(listaCarros.get(2));

        System.out.println(listaCarros.indexOf(new Carro("Ford")));
        System.out.println(listaCarros.remove(2));
        System.out.println(listaCarros);

    }

    public static void hashSet(){
        Set<Carro> hashCarros = new HashSet<>();

        hashCarros.add(new Carro("Ford"));
        hashCarros.add(new Carro("BMW"));
        hashCarros.add(new Carro("Pegeot"));
        hashCarros.add(new Carro("Zip"));

        System.out.println(hashCarros);

        Set<Carro> treSetCarros = new TreeSet<>();

        treSetCarros.add(new Carro("Ford"));
        treSetCarros.add(new Carro("BMW"));
        treSetCarros.add(new Carro("Pegeot"));
        treSetCarros.add(new Carro("Zip"));

        System.out.println(treSetCarros );
    }

    public static void hashMap(){
        Map<String, String> aluno = new HashMap<>();

        aluno.put("nome", "joao");
        aluno.put("idade", "16 anos");
        aluno.put("media", "8.5");
        aluno.put("turma", "quinto ano");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("nome", "ana");
        aluno2.put("idade", "12 anos");
        aluno2.put("media", "5.6");
        aluno2.put("turma", "quarto ano");

        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);
        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("nome"));
        System.out.println(aluno2.containsValue("12 anos"));

    }
}
