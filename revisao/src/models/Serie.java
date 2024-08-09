package models;

public class Serie extends Titulo{

    private int temporada;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    @Override
    public void exibirFichaTecnica(){
        super.exibirFichaTecnica();
        System.out.println(duracaoEmMinutos);
        System.out.println("Número de temporadas: " + temporada);
        System.out.println("Quantidade de episódios por temporada: " + episodiosPorTemporada);
        System.out.println("Tempo por episódio em minutos: " + minutosPorEpisodio);
        if(ativa)
            System.out.println("Série está ativa");
        else
            System.out.println("A série já foi finalizada, aproveite para maratonar!!!");
    }

    @Override
    public void somarNotas(double nota) {

    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
