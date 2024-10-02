package br.com.lumens;

public class Pilha {
    private No entradaPilha;

    public Pilha() {
        this.entradaPilha = null;
    }
    public No top(){
        return entradaPilha;
    }
    public void push(No novoNo){
        No refAuxiliar = entradaPilha;
        entradaPilha = novoNo;
        entradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEnpty()){
            No noPoped = entradaPilha;
            entradaPilha = entradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }
    public boolean isEnpty(){
        if(entradaPilha == null){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        String stringRetorno = "-----------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "------------\n";

        No noAuxiliar = entradaPilha;
        while(true){
            if (noAuxiliar != null){
                stringRetorno +="[No{dado = "+ noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();

            }else {
                break;
            }
        }
        stringRetorno += "==============\n";
        return stringRetorno;
    }
}
