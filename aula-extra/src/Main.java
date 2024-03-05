import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integer anoAtual = 2024;

        System.out.println("Hello world!");

        Scanner leitor = new Scanner(System.in);

        System.out.println("informe o seu nome:");
        String nome = leitor.nextLine();

        System.out.println("em qual ano você nasceu " + nome + "?");
        Integer ano = leitor.nextInt();

        System.out.println("em qual mês você nasceu " + nome + "?");
        Integer mes = leitor.nextInt();

        System.out.println("em qual dia você nasceu " + nome + "?");
        Integer dia = leitor.nextInt();

        Integer idade = anoAtual - ano;

        Pessoa pessoa = new Pessoa();
        pessoa.nome = nome;
        pessoa.nascimento = LocalDate.of(ano,mes,dia);

        System.out.println(pessoa.faleOsSeusDadosBasicos());
    }
}