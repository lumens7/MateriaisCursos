package br.com.lumens;

public class Fila {

    private No refEntradaNo;

    public Fila() {
        this.refEntradaNo = null;
    }

    public void enqueue(Object obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refEntradaNo);
        refEntradaNo = novoNo;
    }

    public No first(){
        if(!this.isEnpty()){
            No primeiroNo = refEntradaNo;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
        }
        return null;
    }

    public No dequeue() {
        No primeiroNo = null;
        if (!this.isEnpty()) {
            primeiroNo = refEntradaNo;
            No noAux = refEntradaNo;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAux = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAux.setRefNo(null);
                    break;
                }
            }
        }
        return primeiroNo;
    }

    public boolean isEnpty(){
        return refEntradaNo ==  null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No noAuxi = refEntradaNo;

        if(refEntradaNo != null){
            while (true){
                stringRetorno += "[No{obg = "+ noAuxi.getObj() + "}]\n";
                noAuxi = noAuxi.getRefNo();
                if (noAuxi.getRefNo() != null){
                    noAuxi = noAuxi.getRefNo();

                }else {
                    stringRetorno +="null";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
