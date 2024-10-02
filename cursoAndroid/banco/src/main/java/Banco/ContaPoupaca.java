package Banco;

public class ContaPoupaca extends Conta{

    public ContaPoupaca(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==Extrato Conta Poupanca==");
        imprimirDados();
    }
}
