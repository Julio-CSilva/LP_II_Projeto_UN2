package br.ufrn.imd.domain.Solicitacao;

import br.ufrn.imd.domain.Pessoa.Civil;

public class Fiscalizacao extends Solicitacao{

    private String cnpj;
    private String nire;

    public Fiscalizacao(Civil solicitante) {
        super(solicitante);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNire() {
        return nire;
    }

    public void setNire(String nire) {
        this.nire = nire;
    }

    @Override
    public String toString() {
        return "Fiscalizacao [solicitante=" + getSolicitante() + ", id=" + getId() + ", data=" + getData() + ", status=" + getStatus() + "cnpj=" + cnpj + ", nire=" + nire + "]";
    }

    
    
}
