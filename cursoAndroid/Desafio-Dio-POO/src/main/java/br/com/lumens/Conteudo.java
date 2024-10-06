package br.com.lumens;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
    public Conteudo(){

    }
    public void cadastroConteudo(Conteudo conteudo){
        conteudos.add(conteudo);
    }
    public void conteudosCadastrados(){
        int i = 1;
        for (Conteudo conteudo : conteudos) {
            System.out.println(i + "-titulo: "+conteudo.getTitulo()+ " descricao: "+ conteudo.getDescricao());
            i++;
        }
    }

    public abstract double calcularXP();
    public String getTitulo() {
        return titulo;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
