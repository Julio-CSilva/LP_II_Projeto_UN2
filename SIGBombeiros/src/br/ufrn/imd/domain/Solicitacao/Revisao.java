package br.ufrn.imd.domain.Solicitacao;

import br.ufrn.imd.domain.Pessoa.Civil;

public class Revisao extends Solicitacao{

    private String codigoRev;

    public Revisao(Civil solicitante) {
        super(solicitante);
    }

    public String getCodigoRev() {
        return codigoRev;
    }

    public void setCodigoRev(String codigoRev) {
        this.codigoRev = codigoRev;
    }
    
    
}
