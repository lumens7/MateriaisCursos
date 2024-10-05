package br.com.lumens;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoCOnsole(nomeDoArquivo);
        System.out.println("Com exception ou não, o programa continua...");
    }

    private static void imprimirArquivoNoCOnsole(String nomeDoArquivo) {
        try{
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null,
                    " " + e.getMessage());
            e.printStackTrace();
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado, por favor, fale com o suporte. " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try{
            return new BufferedReader(new FileReader(nomeDoArquivo));

        }catch (FileNotFoundException e){
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
            //e.printStackTrace();
        }
    }
}


class ImpossivelAberturaDeArquivoException extends Exception{
    private String nomeArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeArquivo, String diretorio) {
        super("O arquivo "+ nomeArquivo+ "não foi encontrado no diretorio "+ diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }


}