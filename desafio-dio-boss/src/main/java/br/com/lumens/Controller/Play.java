package br.com.lumens.Controller;

import br.com.lumens.Domain.Jogador;

import java.util.Scanner;

public class Play {
    public void jogar(){
        Scanner scan = new Scanner(System.in);

        System.out.println("SEJA BEM VINDO AO LUMENSGAME\n" +
                "\n\tInforme o nome para criar um novo jogador" +
                "\n\tPor ser um novo Jogador seus pontos iniciais são de 500 e seu rank de aventureiro é de Ferro e um xp de 500");
        String nome = scan.next();
        Jogador jogador = new Jogador(nome, 500);
        while (true){
            System.out.println("1-calcular Rank" +
                    "\n2-Jogar" +
                    "\n3-sair");
            String resposta = scan.next();
            if(resposta.equals("1")||resposta.equalsIgnoreCase("calcular Rank")){
                calcularRank(jogador.getXPJogador());
            } else if (resposta.equals("2")|| resposta.equalsIgnoreCase("Jogar")) {
                MonstroController monstros = new MonstroController();
                monstros.sortearMonstros();
                System.out.println("escolha um dos três monstros acima pelo index, caso não queira nenhum digite 3");
                Integer escolha = scan.nextInt();
                if (escolha == 3){
                    System.out.println("voltando da floresta!");
                    monstros.limparLista();
                } else if (escolha >3 || escolha<0) {
                    System.out.println("escolha invalida, favor escolher entre 0 e 2");
                    System.out.println("voltando da floresta!");
                }else {
                    monstros.lutarComMonstro(escolha, jogador);
                }
            } else if (resposta.equals("3")||resposta.equalsIgnoreCase("sair")) {
                System.out.println("Obrigado por jogar conosco!");

                break;
            }else {
                System.out.println("opção invalida, favor escolha uma opcao valida");
            }
        }
    }
    public Integer calcularRank(Integer XPJogador){

        if(XPJogador <=1000){   //ferro
            System.out.println("Seu rank é Ferro");
        } else if (XPJogador>1001 && XPJogador <= 2000) {   //bronze
            System.out.println("Seu rank é Bronze");
        }else if (XPJogador > 2001 && XPJogador <= 5000) {   //Prata
            System.out.println("Seu rank é Prata");
        }else if (XPJogador > 5001 && XPJogador <= 7000) {   //Ouro
            System.out.println("Seu rank é Ouro");
        }else if (XPJogador>7001 && XPJogador <= 8000) {   //Platina
            System.out.println("Seu rank é Platina");
        }else if (XPJogador > 8001 && XPJogador <= 9000) {   //Ascendente
            System.out.println("Seu rank é Ascendente");
        }else if (XPJogador > 9001 && XPJogador <= 10000) {   //Imortal
            System.out.println("Seu rank é Imortal");
        }else if (XPJogador >= 10001 ) {   //Radiante
            System.out.println("Seu rank é Radiante");
        }
        return XPJogador;
    }
}
