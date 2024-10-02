package br.com.lumens;

import br.com.lumens.model.Obj;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria<Obj> minhaArvoreBin = new ArvoreBinaria<>();

        minhaArvoreBin.inserir(new Obj(13));
        minhaArvoreBin.inserir(new Obj(10));
        minhaArvoreBin.inserir(new Obj(25));
        minhaArvoreBin.inserir(new Obj(2));
        minhaArvoreBin.inserir(new Obj(12));
        minhaArvoreBin.inserir(new Obj(20));
        minhaArvoreBin.inserir(new Obj(31));
        minhaArvoreBin.inserir(new Obj(29));
        minhaArvoreBin.inserir(new Obj(32));
        minhaArvoreBin.inserir(new Obj(1));

        minhaArvoreBin.exibirInOrdem();
        minhaArvoreBin.exibirPreOrdem();
        minhaArvoreBin.exibirPosOrdem();

    }
}
