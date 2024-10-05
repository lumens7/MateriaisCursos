package br.com.lumens;

import javax.swing.*;

public class ExceptionCurtomizada_2 {
    public static void main(String[] args) {
        int[] numerador = {4,5,8,10};
        int[] denominador = {2,4,0,2,8};


        for(int i = 0; i<denominador.length; i++){
            try{
                if(numerador[i] %2 != 0)
                    throw new DivisaoNaoExataException("divisão não exata", numerador[i], denominador[i]);
                int resultado = numerador[i]/denominador[i];
                System.out.println(resultado);

            }catch (DivisaoNaoExataException e){
                JOptionPane.showMessageDialog(null,
                        e.getMessage());
                e.printStackTrace();
            }catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,
                        "Adicione um numerador para ser dividido!" + e.getCause());
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,
                        "Impossivel dividir um numero por zero!" + e.getCause());
            }

            System.out.println("O programa continua...");
        }
    }
}
class DivisaoNaoExataException extends Exception{
    private int numeroador;
    private int denominador;

    public DivisaoNaoExataException(String mensagem, int numeroador, int denominador) {
        super(mensagem);
        this.numeroador = numeroador;
        this.denominador = denominador;
    }

}
