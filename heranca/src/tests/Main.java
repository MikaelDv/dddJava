package tests;

import models.Funcionario;
import models.Gerente;
import models.Vendedor;

public class Main {
    public static void main(String[] args) {
        double bonificacao;
        Funcionario func = new Funcionario();
        func.setNome("Eliane");
        func.setSalario(1000);
        bonificacao =func.calculaBonificacao();
        System.out.println("Funcionário: " + func.getNome() +
                "\nSalário bruto: " + func.getSalario() +
                "\nBonificação: " + bonificacao +
                "\nSalário líquido: " + (func.getSalario() + bonificacao));

        Gerente gerente = new Gerente();
        gerente.setNome("Rafael");
        gerente.setSalario(1000);
        gerente.setGratificacao(1000);
        bonificacao = gerente.calculaBonificacao();
        System.out.println("\n\nmodels.Gerente: " + gerente.getNome() +
                "\nSalário bruto: " + gerente.getSalario() +
                "\nGratificação do cargo: " + gerente.getGratificacao() +
                "\nBonificação: " + bonificacao +
                "\nSalário líquido: " + (gerente.getSalario() + gerente.getGratificacao() + bonificacao));

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Ana");
        vendedor.setSalario(1000);
        double salarioComComissao = vendedor.calculoComissao(20000);
        bonificacao = vendedor.calculaBonificacao();
        System.out.println("\n\nmodels.Vendedor: " + vendedor.getNome() +
                "\nSalário bruto: " + vendedor.getSalario() +
                "\nComissão: " + vendedor.getComissao() +
                "\nBonificação: " + bonificacao +
                "\nSalário líquido: " + (salarioComComissao + bonificacao));

    }
}