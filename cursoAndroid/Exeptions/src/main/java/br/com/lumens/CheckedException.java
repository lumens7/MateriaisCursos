package br.com.lumens;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-croush";
        try{
            imprimirArquivoNoCOnsole(nomeDoArquivo);

        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado!, Entre em contato com o suporte! "+ e.getCause());
            e.printStackTrace();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja imprimir!"+ e.getCause());
            e.printStackTrace();
        } finally {
            JOptionPane.showMessageDialog(null, "Chegou no Finally.");
        }
        System.out.println("Apesar da exception ou não, o programa continua ...");

    }
    public static void imprimirArquivoNoCOnsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while (line != null);
        bw.flush();
        br.close();
    }
}
