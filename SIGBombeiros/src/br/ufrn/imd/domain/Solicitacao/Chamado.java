package br.ufrn.imd.domain.Solicitacao;

import br.ufrn.imd.domain.Pessoa.Civil;

public class Chamado extends Solicitacao{

    private String descricao;

    public Chamado(Civil solicitante) {
        super(solicitante);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Chamado [solicitante=" + getSolicitante() + ", id=" + getId() + ", data=" + getData() + ", status=" + getStatus() + "descricao=" + descricao + "]";
    }
    
    
}
