package listas;

public class RevisaoVetor {
    public static void main(String[] args) {
        //Conjunto de N elementos de mesmo tipo
        String[] alunos = new String[5];
        Double[] notas = new Double[25];

        alunos[0] = "Eliane";
        alunos[1] = "Ana";
        alunos[2] = "Enzo";
        alunos[3] = "Murilo";
        alunos[4] = "Pamela";

        for (int i = 0; i < 5; i++) {
            System.out.println(alunos[i]);
        }
    }
}
