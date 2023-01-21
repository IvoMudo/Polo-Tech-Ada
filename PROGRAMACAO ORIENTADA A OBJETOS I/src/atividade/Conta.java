package atividade;

public class Conta {
    private double saldo = 50;
    private String id;
    private Cliente donoDaConta;
    public Conta(String id, Cliente donoDaConta) {
        this.saldo = 0;
        this.id = id;
        this.donoDaConta = donoDaConta;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valor;
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDonoDaConta() {
        return donoDaConta.getNome();
    }

    public void setDonoDaConta(Cliente donoDaConta) {
        this.donoDaConta = donoDaConta;
    }
}
