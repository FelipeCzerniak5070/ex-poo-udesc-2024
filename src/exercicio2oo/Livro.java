package exercicio2oo;

public class Livro {
    public String nome, autor;
    public boolean disponivel = true;

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar(){
        disponivel=false;
        System.out.println("Livro emprestado");
    }

    public void devolver(){
        disponivel=true;
        System.out.println("Livro Devolvido");
    }


}
