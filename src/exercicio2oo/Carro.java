package exercicio2oo;

public class Carro {
    public String modelo;
    public double velocidade=0;

    public void acelerar(){
        velocidade+=10;
        System.out.println("Vrum...Vrum...");
    }

    public void frear(){
        velocidade-=10;
        System.out.println("Freando");
    }

    public double consultarVelocidade() {
        return velocidade;
    }

}
