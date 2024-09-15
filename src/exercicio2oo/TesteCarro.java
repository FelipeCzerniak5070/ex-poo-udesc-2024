package exercicio2oo;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();
        System.out.println("Velocidade: "+c1.getVelocidade());

    }
}
