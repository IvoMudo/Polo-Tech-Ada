package Atividade_20_01;

public class Carro extends Veiculo {
    private TipoDeCarro tipoDeCarro;

    public Carro() {
        super(2, 2.2);
    }

    public Carro(TipoDeCarro tipoDeCarro) {
        super(
                switch (tipoDeCarro) {
                    case Hatch -> 1;
                    case SUV -> 6;
                    case Sedan -> 4;
                    case Offroad -> 1;
                }, switch (tipoDeCarro) {
                    case Hatch -> 3;
                    case SUV -> 2.2;
                    case Sedan -> 2.5;
                    case Offroad -> 2;
                }
        );
        this.tipoDeCarro = tipoDeCarro;
    }

//    public Carro(TipoDeCarro tipoDeCarro) {
//        switch (tipoDeCarro) {
//            case Hatch -> super(1, 3);
//            case SUV -> super(6, 2.2);
//            case Sedan -> super(4, 2.5);
//            case Offroad -> super(1, 2);
//        }
//        this.tipoDeCarro = tipoDeCarro;
//    }

    @Override
    public void acelerar(double aceleracao) {
        setVelocidade(getVelocidade() + aceleracao * getFatorDePortencia());
        System.out.println(getVelocidade() + " km/h");
    }

    @Override
    public void frear(double aceleracao) {
        setVelocidade(getVelocidade() + aceleracao * getFatorDePortencia());
        if (getVelocidade() < 0) setVelocidade(0);
        System.out.println(getVelocidade() + " km/h");
    }

    public TipoDeCarro getTipoDeCarro() {
        return tipoDeCarro;
    }

    public void setTipoDeCarro(TipoDeCarro tipoDeCarro) {
        this.tipoDeCarro = tipoDeCarro;
    }
}
