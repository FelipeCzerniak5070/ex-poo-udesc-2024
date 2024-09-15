package exercicio2oo;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.setProprietario("Felipe");
        c1.setSaldo(4000.0);
        c1.depositar(100);
        System.out.println("Saldo: "+c1.getSaldo());
    }
}
