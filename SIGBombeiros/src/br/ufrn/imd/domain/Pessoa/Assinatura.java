package br.ufrn.imd.domain.Pessoa;

import java.util.Random;

public class Assinatura {

    private int assinatura;

    public Assinatura() {
        Random gerador = new Random();

        this.assinatura = gerador.nextInt(100000000);
    }

    public int getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(int assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public String toString() {
        return assinatura+"";
    }

    
    
}
