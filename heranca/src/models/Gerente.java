package models;

import models.Funcionario;

public class Gerente extends Funcionario {
    private double gratificacao;

    @Override
    public double calculaBonificacao(){
        return super.calculaBonificacao() + 1000;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
}
