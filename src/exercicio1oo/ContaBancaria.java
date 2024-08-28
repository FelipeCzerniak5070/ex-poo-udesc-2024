package exercicio1oo;

public class ContaBancaria {
    public String proprietario;
    public double saldo;

    public void sacar(double valor){
        saldo-=valor;
        System.out.println("Você sacou "+ valor);
    }

    public void depositar(double valor){
        saldo+=valor;
        System.out.println("Você depositou "+valor);
    }

    public double consultarSaldo(){
        return saldo;
    }
}
