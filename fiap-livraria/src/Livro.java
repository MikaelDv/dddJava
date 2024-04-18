public class Livro {

    //---ATRIBUTOS ---///
    //+ (public) TipoDado nomeAtributoOuVariavel
    protected String titulo;
    private String autor;
    private double valor;
    private Editora editora;
    private int paginas;
    private String resumo;
    private TipoCapaEnum tipoCapa;


    // --- MÉTODOS ---
    public String exibirDados(){
        String dados =
                "---------------" +
                "\nTitulo: " + this.titulo +
                "\nResumo: " + this.resumo +
                "\nPreço: R$ " + this.valor +
                "\nPáginas: " + this.paginas +
                "\nAutor: " + this.autor +
                "\nEditora:" + this.editora.nome +
                "\n---------------" ;               ;
        return dados;
    }

    public double aplicarDesconto(){
        if(tipoCapa.equals(TipoCapaEnum.COMUM))
            return valor * 0.95;
        return 0;
    }
    public Livro(String titulo){
        this.titulo = titulo;
    }

    public Livro(){}
    public Livro(String titulo, double preco){
        this.titulo = titulo;
        this.valor = preco;
    }
    public Livro(String titulo, String autor,
                 double valor, Editora editora,
                 int paginas, String resumo,
                 TipoCapaEnum tipoCapa) {
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
        this.editora = editora;
        this.paginas = paginas;
        this.resumo = resumo;
        this.tipoCapa = tipoCapa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if(paginas<=0)
            System.out.printf("Páginas inválidas");
        else
            this.paginas = paginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public TipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }
}
