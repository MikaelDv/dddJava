import java.util.Scanner;

//Classe de execução => main
public class CriarLivros {
    public static void main(String[] args) {
        //Instanciando um objeto => criar o objeto na memória
        //tipoObjeto nomeObjeto = operadorInstanciação construtor;
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);
        Livro favorito = new Livro("Sr. dos Anéis");
        Editora editora = new Editora("Harper");
        System.out.println("Qual é o seu nome?");
        favorito.leitor = leitor.nextLine();
        System.out.println("Qual é o seu livro favorito " + favorito.leitor + "?");
        favorito.titulo = leitor.nextLine();
        System.out.println("Quem é o autor desse livro?");
        favorito.autor = leitor.nextLine();
        System.out.println("Qual é a editora que publicou esse livro?");
        favorito.editora = leitor.nextLine();
        System.out.println("Faça um breve resumo desse livro:");
        favorito.resumo = leitor.nextLine();
        System.out.println("Qual é o tipo de capa desse livro?");
        favorito.tipoCapa = leitor.nextLine();
        System.out.println("Quanto custa esse livro?");
        favorito.valor = leitorNum.nextDouble();

        System.out.println(favorito.exibirDados());
    }
}
