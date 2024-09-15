package exercicio2oo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRaio(10.);
        System.out.println("Perímetro: "+c1.calcularPerimetro());
        System.out.println("Area: "+c1.calcularArea());
        System.out.println("Diametro: "+c1.calcularDiametro());
    }
}
