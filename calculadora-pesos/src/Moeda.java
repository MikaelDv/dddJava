import java.util.Scanner;

public class Moeda{
    public double valorReal;
    public double cotacaoPeso;
    public double quantidadePeso;
    public double cotacaoDolar;
    public double quantidadeDolar;

    public void conversaoPeso(){
        this.quantidadePeso = this.valorReal / this.cotacaoPeso;
        System.out.println("Valor em pesos:");
        System.out.print("$");
        System.out.print(quantidadePeso);
    }
    public void conversaoRealPeso(){
        this.quantidadePeso = this.valorReal * this.cotacaoPeso;
        System.out.println("Valor em Real:");
        System.out.print("$");
        System.out.print(quantidadePeso);
    }

    public void conversaoDolar(){
        this.quantidadeDolar = this.valorReal / this.cotacaoDolar;
        System.out.println("Valor em Dolar:");
        System.out.print("$");
        System.out.print(quantidadeDolar);
    }
    public void conversaoDolarReal(){
        this.quantidadePeso = this.quantidadeDolar * this.cotacaoDolar;
        System.out.println("Valor em Real:");
        System.out.print("$");
        System.out.print(quantidadePeso);
    }
    }