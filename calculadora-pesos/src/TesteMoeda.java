import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();
        while (true){
            System.out.println("//------------dinero------------//");
            System.out.println("(1) - Converter de Real para Pesos");
            System.out.println("(2) - Converter de Pesos para Real");
            System.out.println("(3) - Converter Real para Dolar");
            System.out.println("(4) - Converter Dolar para Real");
            int opcao = leitor.nextInt();


            if (opcao == 1) {
                System.out.println("Digite a quantidade de Reais:");
                System.out.print("R$");
                moeda.valorReal = leitor.nextDouble();
                System.out.println("Digite a cotação do Peso:");
                System.out.print("R$");
                moeda.cotacaoPeso = leitor.nextDouble();
                moeda.conversaoPeso();
                break;
            } else if (opcao == 2) {
                System.out.println("Digite a quantidade de Pesos:");
                System.out.print("$");
                moeda.valorReal = leitor.nextDouble();
                System.out.println("Digite a cotação do Peso:");
                System.out.print("R$");
                moeda.cotacaoPeso = leitor.nextDouble();
                moeda.conversaoRealPeso();
                break;
            } else if (opcao == 3) {
                System.out.println("Digite a quantidade de Reais:");
                System.out.print("R$");
                moeda.valorReal = leitor.nextDouble();
                System.out.println("Digite a cotação do Dolar:");
                System.out.print("R$");
                moeda.cotacaoDolar = leitor.nextDouble();
                moeda.conversaoDolar();
                break;
            } else if (opcao == 4) {
                System.out.println("Digite a quantidade de Dolar:");
                System.out.print("$");
                moeda.quantidadeDolar = leitor.nextDouble();
                System.out.println("Digite a cotação do Dolar:");
                System.out.print("$");
                moeda.cotacaoDolar = leitor.nextDouble();
                moeda.conversaoDolarReal();
                break;
            } else {
                System.out.println("Valor inválido, tente novamente!");
            }
        }
    }
}
