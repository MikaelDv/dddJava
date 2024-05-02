public class LivroFisico extends Livro{
    public LivroFisico(String titulo) {
        super(titulo);
    }

    public LivroFisico(String titulo, double preco) {
        super(titulo, preco);
    }

    public double getTaxaImpressao(){
        return valor * 0.05;
    }
}
