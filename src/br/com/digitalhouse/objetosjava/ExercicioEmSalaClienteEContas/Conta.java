package br.com.digitalhouse.objetosjava.ExercicioEmSalaClienteEContas;

public class Conta {
    private Integer numeroDaConta;
    private Float saldo;
    private Cliente titular;

    public Conta(Integer novoNumeroDaConta, Float novoSaldo, Cliente novoTitular) {
        numeroDaConta = novoNumeroDaConta;
        saldo = novoSaldo;
        titular = novoTitular;
    }

    public void deposito(float quantiaEmDinheiro){
        saldo=saldo+quantiaEmDinheiro;
        System.out.println("Você depositou: R$ " + saldo + ". Seu Saldo Atual é de :" + saldo);
    }

}
