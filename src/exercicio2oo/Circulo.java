package exercicio2oo;

public class Circulo {
    private double raio;

    public double calcularArea() {
        return 3.1415*(raio*raio);
    }

    public double calcularPerimetro(){
        return (2*3.1415)*raio;
    }

    public double calcularDiametro(){
        return raio*2;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
