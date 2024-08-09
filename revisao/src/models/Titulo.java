package models;

public abstract class Titulo {
    //Atributos -> Características do objeto
    private String nome;
    private int anoDeLancamento;
    private ClassificacaoEnum classificacaoInd;
    protected int duracaoEmMinutos;
    protected double somaAvaliacao;
    protected int qtdAvaliacao;

    public void exibirFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    //Uma classe abstrata pode ter métodos abstratos
    //Métodos abstratos -> Na super classe não tem implementação e colocamos a palavra abstract
    //Porém as subclasse são OBRIGADAS a implementar o método
    public abstract void somarNotas(double nota);

    //Métodos de acesssos


    public ClassificacaoEnum getClassificacaoInd() {
        return classificacaoInd;
    }

    public void setClassificacaoInd(ClassificacaoEnum classificacaoInd) {
        this.classificacaoInd = classificacaoInd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
