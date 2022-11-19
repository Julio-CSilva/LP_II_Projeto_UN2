package br.ufrn.imd.domain.Escala;

import java.util.ArrayList;

import br.ufrn.imd.domain.Pessoa.Pessoa;

public class Calendario {
    
    private ArrayList<Dia> dias = new ArrayList<>();
    private Pessoa pessoa;
    private String mes;

    public void inserirDias(int quantidade){
    }

    public void editarDia(Dia dia){
    }

    public ArrayList<Dia> getDias() {
        return dias;
    }
    public void setDias(ArrayList<Dia> dias) {
        this.dias = dias;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }

    

}
