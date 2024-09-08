package exercicio2oo;
public class Aluno {
    public String nome;
    public int idade;
    public double n1, n2, n3, n4;
    public double calcularMedia() {
        return (this.n1+this.n2+this.n3+this.n4)/4;
    }

    public void verificarSituacao() {
        if(this.calcularMedia()>=7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }

}