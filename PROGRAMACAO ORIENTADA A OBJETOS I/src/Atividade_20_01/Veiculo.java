package Atividade_20_01;

public abstract class Veiculo {
    //Encapsulamento
    private String tipo;
    private double velocidade = 0;
    private int numPassageiros;
    private int passageirosMax;
    private String fabricante;
    private double fatorDePortencia;

    protected Veiculo(int passageirosMax, double fatorDePortencia) {
        this.passageirosMax = passageirosMax;
    }

    public Veiculo(String tipo, double velocidade, int passageiro, String fabricante) {
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.numPassageiros = passageiro;
        this.fabricante = fabricante;
    }

    public abstract void acelerar(double aceleracao);

    public abstract void frear(double aceleracao);

    //Polimorfismo sobrecarga
    public void addPassageiros() {
        if (this.numPassageiros < this.passageirosMax) {
            this.numPassageiros += 1;
        } else {
            System.out.println("Veiculo lotado");
        }
    }

    public void addPassageiros(int passageiros) {
        if (this.numPassageiros + passageiros <= passageirosMax) {
            this.numPassageiros += passageiros;
        } else {
            System.out.println("Veiculo lotado");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    private void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public int getPassageirosMax() {
        return passageirosMax;
    }

    public void setPassageirosMax(int passageirosMax) {
        this.passageirosMax = passageirosMax;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getFatorDePortencia() {
        return fatorDePortencia;
    }

    public void setFatorDePortencia(double fatorDePortencia) {
        this.fatorDePortencia = fatorDePortencia;
    }
}
