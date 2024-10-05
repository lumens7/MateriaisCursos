package br.com.lumens;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        boolean continueRodando = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                JOptionPane.showMessageDialog(null, "Resultado: "+ resultado);
                continueRodando = false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro "+ e.getMessage());
                e.printStackTrace();
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Inpossivel dividir um numero por zero "+ e.getMessage());
                e.printStackTrace();
            }
            finally {
                JOptionPane.showMessageDialog(null, "Chegou no finally!");
            }

        }while (continueRodando);

    }
    public static int dividir(int a, int b){
        return a/b;
    }
}
