import enums.TamanhoEnum;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitorTxt = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);

        Flor orchidea = new Flor("Orchidea Pink", TamanhoEnum.MEDIO, 189);
        Flor mix = new Flor("Mix de Flores", TamanhoEnum.GRANDE, 250);
        Flor buque = new Flor("Buquê de Flores do Campo", TamanhoEnum.PEQUENO, 70);

        Floricultura mikaelFlowers = new Floricultura();

        mikaelFlowers.cadastrar(orchidea);
        mikaelFlowers.cadastrar(mix);
        mikaelFlowers.cadastrar(buque);

        String menu = """
                (C) - Cadastrar
                (L) - Listar 
                (S) - Sair
                Digite sua opção""";

        boolean on = true;

        while (on){
            System.out.println(menu);
            String opt = leitorTxt.nextLine().toLowerCase();
            switch (opt) {
                case "c":
                    System.out.println("Qual é o nome da flor?");
                    String produto = leitorTxt.nextLine();
                    System.out.println("Qual é o tamanho dessa flor?(Pequeno/Medio/Grande)");
                    TamanhoEnum tamanho = TamanhoEnum.valueOf(leitorTxt.nextLine().toUpperCase());
                    System.out.println("Qual o preço?");
                    double preco = leitorNum.nextDouble();
                    Flor nova = new Flor(produto, tamanho, preco);
                    mikaelFlowers.cadastrar(nova);
                    break;
                case "l":
                    System.out.println("******" + " Flores " + "******");
                    for (Flor flor: mikaelFlowers.getFlores()) {
                        System.out.println("Nome: " + flor.getProduto());
                        System.out.println("Tamanho: " + flor.getTamanho());
                        System.out.println("Preço: " + flor.getPreco());
                        System.out.println("********************");
                    }
                    break;
                case "s":
                    System.out.println("Até logo!");
                    on = false;
                    break;
                default:
                    System.out.println("Opção Inválida!!");
                    break;
            }
        }
    }
}