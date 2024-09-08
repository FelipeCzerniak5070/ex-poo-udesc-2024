package exercicio2oo;

public class TesteLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.nome="Homens são de Marte, Mulheres são de Vênus";
        l1.emprestar();

        if(l1.isDisponivel()){
            System.out.println("Disponível!");
        }else{
            System.out.println("Indisponível");
        }

        l1.devolver();

        if(l1.isDisponivel()){
            System.out.println("Disponível!");
        }else{
            System.out.println("Indisponível");
        }

    }
}
