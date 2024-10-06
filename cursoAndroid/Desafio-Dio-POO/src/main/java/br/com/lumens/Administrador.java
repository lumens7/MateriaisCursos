package br.com.lumens;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Administrador {
    private String nome;
    private int numCarteira;
    private Set<Administrador> adms = new LinkedHashSet<>();
    private Set<Conteudo> conteudosCriados = new LinkedHashSet<>();

    public Administrador(String nome, int numCarteira) {
        this.nome = nome;
        this.numCarteira = numCarteira;
    }
    public void cadastrarAdm(Administrador adm){
        adms.add(adm);
    }
    public void cadastrarConteudo(Conteudo conteudo){
        conteudosCriados.add(conteudo);
    }
    public boolean verificaLoginAdm(Administrador adm){
        return adms.contains(adm);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(int numCarteira) {
        this.numCarteira = numCarteira;
    }

    public Set<Conteudo> getConteudosCriados() {
        return conteudosCriados;
    }

    public void setConteudosCriados(Set<Conteudo> conteudosCriados) {
        this.conteudosCriados = conteudosCriados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Administrador that = (Administrador) o;
        return numCarteira == that.numCarteira && Objects.equals(nome, that.nome) && Objects.equals(conteudosCriados, that.conteudosCriados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numCarteira, conteudosCriados);
    }
}
