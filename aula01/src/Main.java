import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem Vindos");

        String nomeAluno, telefone;
        int idade;

        System.out.println("Digite seu nome:");
        nomeAluno = leitor.nextLine();

        System.out.println();
        System.out.println("Seja bem-vindo à Fiap " + nomeAluno);
    }
}