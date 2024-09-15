package exercicio2oo;

public class ContaBancaria {
    private String proprietario;
    private double saldo;

    public void sacar(double valor){
        saldo-=valor;
        System.out.println("Você sacou "+ valor);
    }

    public void depositar(double valor){
        saldo+=valor;
        System.out.println("Você depositou "+valor);
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }


}
