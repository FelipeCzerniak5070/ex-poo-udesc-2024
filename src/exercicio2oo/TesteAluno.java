package exercicio2oo;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome="Gabriel Machado";
        a1.idade=19;
        a1.n1=9.0;
        a1.n2=9.0;
        a1.n3=9.0;
        a1.n4=9.0;
        a1.verificarSituacao();
        System.out.println("Média: "+a1.calcularMedia());
    }
}
