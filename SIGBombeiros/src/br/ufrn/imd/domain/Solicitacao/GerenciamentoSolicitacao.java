package br.ufrn.imd.domain.Solicitacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import br.ufrn.imd.domain.Pessoa.Civil;

public class GerenciamentoSolicitacao {

    private List<Solicitacao> solicitacoes;

    public GerenciamentoSolicitacao(){
        solicitacoes = new ArrayList<Solicitacao>();
    }

    public List<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }

    public void addSolicitacoes(Solicitacao so) {
        this.solicitacoes.add(so);
    }

    public void criarChamado(Civil solicitante){
        Chamado chamado = new Chamado(solicitante);

        Date date = new Date();
        chamado.setData(date);
        chamado.setId(1);
        chamado.setDescricao("Incendio em uma residencia causada por um problema de fiação");
        chamado.setStatus("EM ANDAMENTO");

        addSolicitacoes(chamado);
    }

    public void verSolicitacoes(){
        for(Solicitacao d : solicitacoes){
            System.out.println(d);
        }
    }

    
    
}
