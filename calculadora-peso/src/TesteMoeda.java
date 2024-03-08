import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();

        System.out.println("//------------dinero------------//");
        System.out.println("(1) - Converter de Real para Pesos");
        System.out.println("(2) - Converter de Pesos para Real");
        int opcao = leitor.nextInt();

        if(opcao == 1){
            System.out.println("Digite a quantidade de Reais:");
            System.out.print("R$");
            moeda.valorReal = leitor.nextDouble();
            System.out.println("Digite a cotação do Peso:");
            System.out.print("$");
            moeda.cotacaoPeso = leitor.nextDouble();
            moeda.conversaoPeso();
        } else if (opcao == 2) {
            System.out.println("Digite a quantidade de Pesos:");
            System.out.print("$");
            moeda.valorReal = leitor.nextDouble();
            System.out.println("Digite a cotação do Peso:");
            System.out.print("R$");
            moeda.cotacaoPeso = leitor.nextDouble();
            moeda.conversaoReal();
        } else {
            System.out.println("Valor inválido, tente novamente!");
        }
    }
}
