package Atividade_20_01;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus();
        onibus.acelerar(50.0);
        onibus.frear(50.0);

        Carro carroMaluco = new Carro(TipoDeCarro.SUV);
        System.out.println(carroMaluco.getTipoDeCarro());;
    }
}
