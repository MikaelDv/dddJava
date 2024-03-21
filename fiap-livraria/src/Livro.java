public class Livro {
    //-- Atributos
    //public(+) TipoDado nomeAtributoOuVariavel
    public String leitor;
    public String titulo;
    public String autor;
    public Editora editora;
    public String resumo;
    public String tipoCapa;
    public int paginas;
    public double valor;

    public Livro(String varTitulo){
        this.titulo = varTitulo;
    }

    // --- MÉTODOS ---
    public String exibirDados(){
        String dados =
                "------------------------" +
                "\nTitulo: " + this.titulo +
                "\nEditora: " + this.editora.nome +
                "\nResumo: " + this.resumo +
                "\nPreço: R$" + this.valor +
                "\nCapa: " + this.tipoCapa +
                "\nPáginas: " + this.paginas +
                "\nAutor: " + this.autor +
                "\n------------------------";
        return dados;
    }
}
