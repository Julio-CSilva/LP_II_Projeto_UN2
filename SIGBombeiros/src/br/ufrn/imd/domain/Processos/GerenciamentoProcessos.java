package br.ufrn.imd.domain.Processos;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.domain.Pessoa.Pessoa;

public class GerenciamentoProcessos {

    private List<Processo> processos;

    public GerenciamentoProcessos() {
        processos = new ArrayList<Processo>();
    }
    
    public void criarProcesso(){

    }
    public void vincularPessoas(){
        
    }
    public void editarProcesso(){
        
    }
    public void arquivarProcesso(){
        
    }
    public void assinarProcesso(){
        
    }

    public void addProcesso(Processo p){
        processos.add(p);
    }

    public boolean verifAcesso(Pessoa p){
        if(p.getNiAcesso() != 1){
            return true;
        } else {
            return false;
        }
    }
}
