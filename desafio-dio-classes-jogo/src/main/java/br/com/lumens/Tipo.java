package br.com.lumens;

import java.util.ArrayList;
import java.util.List;

public class Tipo {
    private String nome;
    private String abilidades;
    private String ataque;
    private List<Tipo> tipos = new ArrayList<>();

    public Tipo(String nome, String abilidades, String ataque) {
        this.nome = nome;
        this.abilidades = abilidades;
        this.ataque = ataque;
    }
    public Tipo(){

    }

    public void addTipos(){
        Tipo guerreiro = new Tipo("guerreiro", "uso de espara", "arrancada com espada");
        tipos.add(guerreiro);
        Tipo mago = new Tipo("Mago", "uso de magias", "ataque magico");
        tipos.add(mago);
        Tipo pluguinista = new Tipo("Pluguinista", "uso de artes marciais", "sequencia de socos");
        tipos.add(pluguinista);
        Tipo ninja = new Tipo("Ninja", "uso de furtividade e shuriken", "ataque com shuriken");
        tipos.add(ninja);
        Tipo arqueiro = new Tipo("Arqueiro", "uso de arco", "tiro com flecha");
        tipos.add(arqueiro);

    }
    public void imprimirTipos(){
        if (tipos.isEmpty()){
            addTipos();
        }
        for(int i = 0; i < tipos.size(); i++){
            System.out.println(tipos.get(i));
        }
    }

    public void escolhendoTipo(Integer index, Heroi heroi){
        heroi.setTipo(tipos.get(index));
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbilidades() {
        return abilidades;
    }

    public void setAbilidades(String abilidades) {
        this.abilidades = abilidades;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public List<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(List<Tipo> tipos) {
        this.tipos = tipos;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "nome='" + nome + '\'' +
                ", abilidades='" + abilidades + '\'' +
                ", ataque='" + ataque + '\'' +
                '}';
    }
}
