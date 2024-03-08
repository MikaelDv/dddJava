import java.util.Scanner;

public class Moeda {
    public double valorReal;
    public double cotacaoPeso;
    public double quantidadePeso;

    public void conversaoPeso(){
        this.quantidadePeso = this.valorReal / this.cotacaoPeso;
        System.out.println("Valor em pesos:");
        System.out.print("$");
        System.out.print(quantidadePeso);
    };
    public void conversaoReal(){
        this.quantidadePeso = this.valorReal * this.cotacaoPeso;
        System.out.println("Valor em Real:");
        System.out.print("$");
        System.out.print(quantidadePeso);
    }
}
