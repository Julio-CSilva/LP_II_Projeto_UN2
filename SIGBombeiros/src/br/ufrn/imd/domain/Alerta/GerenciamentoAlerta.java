package br.ufrn.imd.domain.Alerta;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.domain.Pessoa.Bombeiro;

public class GerenciamentoAlerta {
    
    private List<Caso> casosEmAndamento;
    private List<Caso> casosEncerrados;

    

    public GerenciamentoAlerta() {
        casosEmAndamento = new ArrayList<Caso>();
        casosEncerrados = new ArrayList<Caso>();
    }

    public void criarCaso(Bombeiro bombeiro){
        Caso caso = new Caso();
        caso.setBombeiros(bombeiro);
        caso.setDescricao("Incendio em uma residencia causada por um problema de fiação");
        Date date = new Date();
        caso.setData(date);
        caso.setLocal("Lagoa nova");
        caso.setTitulo("Incendio eletrico");
        addCasosEmAndamento(caso);

        Caso caso2 = new Caso();
        caso2.setBombeiros(bombeiro);
        caso2.setDescricao("Resgate de sobreviventes em um deslizamento");
        Date date2 = new Date();
        caso2.setData(date2);
        caso2.setLocal("Lua");
        caso2.setTitulo("Deslizamento");
        addCasosEncerrados(caso2);

    }

    public void editarCaso(String titulo){

    } 

    public void excluir(String titulo){

    }

    public List<Caso> getCasosEmAndamento() {
        return casosEmAndamento;
    }
    public void addCasosEmAndamento(Caso caso) {
        this.casosEmAndamento.add(caso);
    }
    public List<Caso> getCasosEncerrados() {
        return casosEncerrados;
    }
    public void addCasosEncerrados(Caso caso) {
        this.casosEncerrados.add(caso);
    }

    @Override
    public String toString() {
        return "Ultimo caso encerrado: "+ getCasosEncerrados().get(0) 
                +"\nCaso em Andamento: " + getCasosEmAndamento().get(0);
    }

    

    
}
