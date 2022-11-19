package br.ufrn.imd.domain.Processos;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import br.ufrn.imd.domain.Pessoa.Assinatura;
import br.ufrn.imd.domain.Pessoa.Pessoa;

public class Processo {

    private String numeroid;
    private String tag;
    private Date dataCriacao;
    private Date ultimaAlteracao;
    private List<Assinatura> assinaturas;
    private List<Pessoa> vinculados;

    public Processo() {
        assinaturas = new ArrayList<Assinatura>();
        vinculados = new ArrayList<Pessoa>();
        setDataCriacao();
        setUltimaAlteracao();
    }

    public String getNumeroid() {
        return numeroid;
    }
    public void setNumeroid(String numeroid) {
        this.numeroid = numeroid;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public Date getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao() {
        Date date = new Date();
        this.dataCriacao = date;
    }
    public Date getUltimaAlteracao() {
        return ultimaAlteracao;
    }
    public void setUltimaAlteracao() {
        Date date = new Date();
        this.dataCriacao = date;
    }

    public void addvinculo (Pessoa p){
        vinculados.add(p);
    }
    public void assinar(Assinatura as){
        assinaturas.add(as);
    }
    public void imprimirVinculados(){
        for(Pessoa d : vinculados){
            System.out.println(d);
        }
    }
    public void imprimirAssinaturas(){
        for(Assinatura a : assinaturas){
            System.out.println("Assinatura digital: " + a);
        }
    }

    
    
}
