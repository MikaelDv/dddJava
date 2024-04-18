package models;

import models.Funcionario;

public class Vendedor extends Funcionario {
    private double comissao;
    @Override
    public double calculaBonificacao(){
        return super.calculaBonificacao() + 500;
    }

    public double calculoComissao(double valorVendido) {
        this.comissao = valorVendido * 0.1;
        return super.getSalario() + this.comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
