package br.ufrn.imd.domain.Alerta;

import java.util.ArrayList;

public class Alerta {
    
    private ArrayList<Caso> casosEmAndamento = new ArrayList<>();
    private ArrayList<Caso> casosEncerrados = new ArrayList<>();

    public Caso criarCaso(){

    }

    public void editarCaso(String titulo){

    } 

    public void excluir(String titulo){

    }

    public void visualizarAlertas(){

    }

    public Boolean verificarAcesso(Pessoa pessoa){
        
    }

    public ArrayList<Caso> getCasosEmAndamento() {
        return casosEmAndamento;
    }
    public void setCasosEmAndamento(ArrayList<Caso> casosEmAndamento) {
        this.casosEmAndamento = casosEmAndamento;
    }
    public ArrayList<Caso> getCasosEncerrados() {
        return casosEncerrados;
    }
    public void setCasosEncerrados(ArrayList<Caso> casosEncerrados) {
        this.casosEncerrados = casosEncerrados;
    }

    
}
