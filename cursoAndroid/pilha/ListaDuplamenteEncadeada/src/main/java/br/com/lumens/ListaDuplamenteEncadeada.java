package br.com.lumens;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }
    public int size(){
        return this.tamanhoLista;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; (i<index) && (noAuxiliar!= null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T conteudo){
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }if (ultimoNo!= null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }


    public void add(int indice, T conteudo){
        NoDuplo<T> noAux = getNo(indice);
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoProximo(noAux);

        if (novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAux.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else {
            novoNo.setNoProximo(ultimoNo);
            ultimoNo = novoNo;
        }

        if(indice ==0){
            primeiroNo = novoNo;
        }else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo!= null){
                primeiroNo.setNoPrevio(null);

            }
        }else {
            NoDuplo<T> noAux = getNo(index);
            noAux.getNoPrevio().setNoProximo(noAux.getNoProximo());
            if(noAux != ultimoNo){
                noAux.getNoProximo().setNoPrevio(noAux.getNoPrevio());
            }else {
                ultimoNo = noAux;
            }
        }

        this.tamanhoLista--;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAux = primeiroNo;
        for(int i = 0; i< size(); i++){

            strRetorno+= "[No{conteudo= " + noAux + "}]-->\n";
            noAux = noAux.getNoProximo();
        }
        strRetorno+= "null";
        return strRetorno;

    }
    public String impressora(){
        return "tamanho da lista = "+ tamanhoLista;
    }
}
