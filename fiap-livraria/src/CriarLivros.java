//Classe de execução => main
public class CriarLivros {
    public static void main(String[] args) {
        //Instanciando um objeto => criar o objeto na memória
        // tipoObjeto nomeObjeto = operadorInstanciação  construtor;
        //   Livro      favorito =       new               Livro();
        //Instanciar editora
        Editora editora = new Editora();
        editora.nome = "Harper Collins";
        editora.representante = "Joao";
                Livro favorito = new Livro("O Hobbit");
        //favorito.titulo = "O Hobbit";
        favorito.setAutor("J. R. R. Talkien");
        favorito.setValor(37.27);
        favorito.setEditora(editora);
        favorito.setResumo("Bilbo era um dos ...");
        favorito.setTipoCapa(TipoCapaEnum.COMUM);

        System.out.println("Meu livro favorito é:" +
        favorito.getTitulo() + "\nSeu autor é: " + favorito.getAutor() +
        " preço: R$ " + favorito.getValor());
        System.out.println(favorito.exibirDados());

        Livro meuLivro = new Livro("UML 2.0",5);
        //meuLivro.titulo = "UML 2.0";
        meuLivro.setValor(58.98);
        meuLivro.setEditora(editora);
        //System.out.println("\n\nTitulo: " + meuLivro.titulo);
        //System.out.println("Autor: " + meuLivro.autor);
        System.out.println(meuLivro.exibirDados());

        LivroDigital livroDigital = new LivroDigital();
        //livroDigital.
    }
}
