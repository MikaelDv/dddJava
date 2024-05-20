import enums.TamanhoEnum;

public class Flor {
    private String produto;
    private TamanhoEnum tamanho;
    private double preco;


    public Flor(String produto, TamanhoEnum tamanho, double preco) {
        this.produto = produto;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public TamanhoEnum getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoEnum tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
