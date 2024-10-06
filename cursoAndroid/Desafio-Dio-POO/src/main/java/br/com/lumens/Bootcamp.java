package br.com.lumens;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private static Set<Bootcamp> bootcamps = new LinkedHashSet<>(); // Tornar estático para acessar em qualquer parte

    public void cadastroBootcamp(Bootcamp bootcamp) {
        bootcamps.add(bootcamp);
    }

    public void bootcampsCadastrados() {
        int i = 1;
        for (Bootcamp bootcamp : bootcamps) {
            System.out.println(i + " - " + bootcamp.getNome() + ": " + bootcamp.getDescricao() + " "+ bootcamp.getConteudos());
            i++;
        }
    }

    public Bootcamp escolherBootcamp(int indice) {
        List<Bootcamp> bootcampList = new ArrayList<>(bootcamps);
        if (indice > 0 && indice <= bootcampList.size()) {
            return bootcampList.get(indice - 1); // Ajustar para índices começando de 1
        } else {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
    }

    public void adicionarConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    // Construtores e getters/setters
    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Bootcamp() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
}
