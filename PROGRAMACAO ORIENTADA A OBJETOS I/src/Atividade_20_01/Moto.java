package Atividade_20_01;

public class Moto extends Veiculo {

    public Moto() {
        super(2, 1.8);
    }

    //Polimorfismo tipo sobreescrita
    @Override
    public void acelerar(double aceleracao) {
        setVelocidade(getVelocidade() + aceleracao * getFatorDePortencia());
        System.out.println(getVelocidade()+" km/h");
    }

    @Override
    public void frear(double aceleracao) {
        setVelocidade(getVelocidade() - aceleracao * getFatorDePortencia());
        System.out.println(getVelocidade()+" km/h");
        if (getVelocidade()<0) setVelocidade(0);
    }
}
