package tests;

import models.ClassificacaoEnum;
import models.Filme;
import models.Serie;
import models.Titulo;

public class Principal {
    public static void main(String[] args) {
        Serie titulo = new Serie();
        titulo.setNome("Lucifer");
        titulo.setAnoDeLancamento(2013);
        titulo.setDuracaoEmMinutos(1500);
        titulo.exibirFichaTecnica();

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Naruto");
        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.setDuracaoEmMinutos(500000);
        minhaSerie.setAtiva(false);
        minhaSerie.setTemporada(18);
        minhaSerie.setEpisodiosPorTemporada(20);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.setClassificacaoInd(ClassificacaoEnum.DEZESSEIS);
        minhaSerie.exibirFichaTecnica();

        Filme filme = new Filme();
        filme.setNome("Sem memória");

    }
}
