package atividade;

public class Main {
    public static void main(String[] args) {
        Cliente ivo = new Cliente("Ivo Augusto", "8451230564", 23);
        Cliente renan = new Cliente("Renan", "8451230564", 23);
        Conta ivoConta = new Conta("008", ivo);
        Conta renanConta = new Conta("007", renan);

        System.out.println("Saldo do Ivo " + ivoConta.getSaldo());
        System.out.println("Saldo do Renan " + renanConta.getSaldo());

        ivoConta.depositar(1500);
        ivoConta.sacar(500);
        ivoConta.transferir(renanConta, 500);

        System.out.println("Saldo do Ivo " + ivoConta.getSaldo());
        System.out.println("Saldo do Renan " + renanConta.getSaldo());

        ContaPj ivoPj = new ContaPj("9846", ivo);
//        System.out.println(ivoPj.saldo);
    }
}