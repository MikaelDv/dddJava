import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = numero.nextDouble();
        System.out.println("Digite sua altura:");
        double altura = numero.nextDouble();

        Calculo calculo = new Calculo(peso, altura);
        System.out.println(calculo.exibirMensagem());

        double imc = calculo.calcularIMC();
        if(imc < 18.5 || imc > 25){
            System.out.println("Qual é o seu sexo?\n(1) - Masculino\n(2) - Feminino");
            int sexo = numero.nextInt();
            System.out.println("Seu peso ideal é: " + calculo.pesoIdeal());
        }
    }
}
