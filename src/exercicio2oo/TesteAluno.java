package exercicio2oo;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Gabriel Machado");
        a1.setIdade(19);
        a1.setN1(9.0);
        a1.setN2(9.0);
        a1.setN3(9.0);
        a1.setN4(9.0);
        a1.verificarSituacao();
        System.out.println("Média: "+a1.calcularMedia());
    }
}
