package exercicio1oo;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.proprietario="Felipe";
        c1.saldo=4000.0;
        c1.depositar(100);
        System.out.println("Saldo: "+c1.consultarSaldo());
    }
}
