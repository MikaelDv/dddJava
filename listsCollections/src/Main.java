import java.util.ArrayList;
import java.util.List;

class Main {

    // Main driver method
    public static void main(String[] args)
    {
        Aluno mikael = new Aluno();
        mikael.setIdade(19);
        mikael.setNome("Mikael");
        Aluno murilo = new Aluno();
        murilo.setNome("Murilo");
        murilo.setIdade(19);

        List<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(murilo);
        listaAlunos.add(mikael);

        for (Aluno aluno : listaAlunos ) {
            System.out.println(aluno.nome);
            System.out.println(aluno.idade);
        }

        System.out.println(Aluno.qtdAlunos);
    }
}