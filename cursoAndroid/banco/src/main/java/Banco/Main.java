package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Lumens", 123);
        Scanner s = new Scanner(System.in);
        System.out.println("== Seja bem vindo ao banco Lumens! ==");
        System.out.println("Informe os dados para cadastro do cliente (nome, cpf): ");
        String nome = s.next();
        int cpf = s.nextInt();
        Cliente cliente = new Cliente(nome, cpf);
        Conta cc = new ContaCorrente(banco, cliente);
        Conta poupanca = new ContaPoupaca(banco, cliente);
        while (true){
            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
            System.out.println("\n\nInforme qual operação deseja fazer\n " +
                    "\t1-depositar\n " +
                    "\t2-sacar\n " +
                    "\t3-transferir\n" +
                    "\t4-sair");
            int resposta = s.nextInt();
            if(resposta == 1){
                System.out.println("Informe o saldo e o numero da conta que deseja depositar");
                int saldo = s.nextInt();
                int numeroCont = s.nextInt();
                if(cc.getNumero() == numeroCont){
                    cc.depositar(saldo);
                    System.out.println("Deposito concluido com sucesso!");
                } else if (poupanca.getNumero() == numeroCont) {
                    poupanca.depositar(saldo);
                    System.out.println("Deposito concluido com sucesso!");
                }else {
                    System.out.println("Conta informada não existe!\n" +
                            "Favor informe uma conta existente.");
                }
            } else if (resposta == 2) {
                System.out.println("informe o valor que deseja sacar e o numero da conta");
                int saldo = s.nextInt();
                int numConta = s.nextInt();
                if(cc.getNumero() == numConta){
                    cc.sacar(saldo);
                    System.out.println("Saque efetuado com sucesso!\n" +
                            "retire seu dinheiro no caixa.");
                } else if (poupanca.getNumero() == numConta) {
                    poupanca.sacar(saldo);
                    System.out.println("Saque efetuado com sucesso!\n" +
                            "retire seu dinheiro no caixa.");
                }else {
                    System.out.println("Conta informada não existe!\n" +
                            "Favor informe uma conta existente.");
                }

            }else if(resposta ==3){
                System.out.println("Informe o valor que deseja transferir e a conta em que seja retirado e a conta destino");
                int saldo = s.nextInt();
                int contaIni = s.nextInt();
                int contaDest = s.nextInt();
                if (cc.getNumero() == contaIni){
                    cc.transferir(saldo, poupanca);
                    System.out.println("Transferencia efetuada com sucesso!");
                } else if (poupanca.getNumero() == contaIni) {
                    poupanca.transferir(saldo, cc);
                    System.out.println("Transferencia efetuada com sucesso!");
                }else {
                    System.out.println("Conta informada não existe!\n" +
                            "Favor informe uma conta existente.");
                }

            } else if (resposta ==4) {
                System.out.println("Obrigado por utilizar nosso sistema!");
                break;
            }
        }
    }
}

