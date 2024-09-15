package exercicio2oo;

public class Carro {
    private String modelo;
    private double velocidade=0;

    public void acelerar(){
        velocidade+=10;
        System.out.println("Vrum...Vrum...");
    }

    public void frear(){
        velocidade-=10;
        System.out.println("Freando");
    }

    public double getVelocidade() {
        return velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
