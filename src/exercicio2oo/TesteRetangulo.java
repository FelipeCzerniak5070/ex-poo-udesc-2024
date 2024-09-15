package exercicio2oo;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        r1.setHeight(9.);
        r1.setWidth(10.);
        System.out.println("Área: "+r1.calcularArea());

    }
}
