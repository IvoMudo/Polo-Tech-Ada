package Atividade_20_01;

public class Onibus extends Veiculo{

    private String motorista;
    public Onibus() {
        super(50, 1.2);
    }

    @Override
    public void acelerar(double aceleracao) {
        if (getVelocidade()>80) {
            System.out.println("Velocidade maxima atingida.");
            return;
        }
        setFatorDePortencia((1.2 - this.getNumPassageiros()/getPassageirosMax()));
        setVelocidade(getVelocidade() + aceleracao * getFatorDePortencia());
        System.out.println(getVelocidade()+" km/h");
    }

    @Override
    public void frear(double aceleracao) {
        if (getVelocidade()>80) {
            System.out.println("Velocidade maxima atingida.");
            return;
        }
        setFatorDePortencia((1.2 - this.getNumPassageiros()/getPassageirosMax()));
        setVelocidade(getVelocidade() - aceleracao * getFatorDePortencia());
        if (getVelocidade()<0) setVelocidade(0);
        System.out.println(getVelocidade()+" km/h");
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }
}
