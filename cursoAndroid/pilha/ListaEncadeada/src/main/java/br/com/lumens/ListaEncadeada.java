package br.com.lumens;

public class ListaEncadeada <T>{
    No<T> referenciaEntrada;
    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }
    public boolean isEnpty(){
        return referenciaEntrada ==null? true : false;
    }
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if (referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        return tamanhoLista;
    }
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEnpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxilixar = referenciaEntrada;
        for(int i = 0; i<this.size()-1; i++){
            noAuxilixar = noAuxilixar.getProximoNo();
        }

        noAuxilixar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxilixar = referenciaEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i<=index; i++){
            noRetorno = noAuxilixar;
            noAuxilixar = noAuxilixar.getProximoNo();
        }
        return noRetorno;
    }
    private void validaIndice(int index){
        if(index>= size()){
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("" +
                    "Não Existe conteúdo no indice "+index+" desta lista. Esta lista so vai ate o indice "+ ultimoIndice);
        }
    }

    public T get(int indice){
        return getNo(indice).getConteudo();
    }

    public T remove(int index){
        No<T> noPivo = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }
        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }


    @Override
    public String toString(){
        String strRetorno = "";
        No<T> noAux = referenciaEntrada;
        for(int i = 0; i<this.size(); i++){
            strRetorno += "[No{conteudo= "+ noAux.getConteudo() +"}]";
            noAux = noAux.getProximoNo();
        }
        strRetorno +="null";
        return strRetorno;
    }
}
