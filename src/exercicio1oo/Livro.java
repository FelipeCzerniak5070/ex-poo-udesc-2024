package exercicio1oo;

public class Livro {
    private String nome, autor;
    private boolean disponivel = true;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
