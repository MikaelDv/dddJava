//Classe de execução => main
public class CriarLivros {
    public static void main(String[] args) {
        //Instanciando um objeto => criar o objeto na memória
        //tipoObjeto nomeObjeto = operadorInstanciação construtor;
        Livro favorito = new Livro();
        favorito.titulo = "O Hobbit";
        favorito.autor = "J. R. R. Talkien";
        favorito.editora = "Harper Collins";
        favorito.resumo = "Bilbo era um dos...";
        favorito.tipoCapa = "COMUM";
        favorito.valor = 37.27;

        System.out.println("Meu livro favorito é " + favorito.titulo + ", seu autor é: " + favorito.autor + " e custa: R$" + favorito.valor + ".\n\n");

        Livro meuLivro = new Livro();
        meuLivro.titulo = "UML 2.0";
        meuLivro.valor = 59.90;

        System.out.println("Meu livro:");
        System.out.println(meuLivro.titulo);
        System.out.println(meuLivro.valor);
    }
}
