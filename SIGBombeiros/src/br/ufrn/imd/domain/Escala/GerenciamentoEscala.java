package br.ufrn.imd.domain.Escala;

import java.util.ArrayList;
import java.util.Date;

import br.ufrn.imd.domain.Pessoa.Pessoa;

public class GerenciamentoEscala {
    private ArrayList<Calendario> escalasData = new ArrayList<>();
    private ArrayList<Pessoa> escalasPessoa = new ArrayList<>();
    private Date diaHoje;

    //public Calendario criarCalendario(){}

    public void editarCalendario(){

    }

    public void excluirCalendario(Calendario calendario){

    } 

    public void visualizarEscala(Pessoa pessoa){

    }

    //public Boolean verificarAcesso(Pessoa pessoa){}

    public ArrayList<Calendario> getEscalasData() {
        return escalasData;
    }
    public void setEscalasData(ArrayList<Calendario> escalasData) {
        this.escalasData = escalasData;
    }
    public ArrayList<Pessoa> getEscalasPessoa() {
        return escalasPessoa;
    }
    public void setEscalasPessoa(ArrayList<Pessoa> escalasPessoa) {
        this.escalasPessoa = escalasPessoa;
    }
    public Date getDiaHoje() {
        return diaHoje;
    }
    public void setDiaHoje(Date diaHoje) {
        this.diaHoje = diaHoje;
    }

}
