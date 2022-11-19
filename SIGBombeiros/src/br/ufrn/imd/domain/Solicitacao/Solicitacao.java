package br.ufrn.imd.domain.Solicitacao;

import java.util.Date;

import br.ufrn.imd.domain.Pessoa.Civil;

public abstract class Solicitacao {

    private Civil solicitante;
    private int id;
    private Date data;
    private String status;

    public Solicitacao(Civil solicitante) {
        this.solicitante = solicitante;
    }
    
    public Civil getSolicitante() {
        return solicitante;
    }
    public void setSolicitante(Civil solicitante) {
        this.solicitante = solicitante;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Solicitacao [solicitante=" + solicitante + ", id=" + id + ", data=" + data + ", status=" + status + "]";
    }

    
    
}
