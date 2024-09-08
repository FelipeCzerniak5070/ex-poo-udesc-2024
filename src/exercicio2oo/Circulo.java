package exercicio2oo;

public class Circulo {
    public double raio;

    public double calcularArea() {
        return 3.1415*(raio*raio);
    }

    public double calcularPerimetro(){
        return (2*3.1415)*raio;
    }

    public double calcularDiametro(){
        return raio*2;
    }
}
