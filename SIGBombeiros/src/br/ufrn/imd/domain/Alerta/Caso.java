package br.ufrn.imd.domain.Alerta;

import java.util.Date;

import br.ufrn.imd.domain.Pessoa.Bombeiro;

public class Caso {
    private Bombeiro bombeiros;
    private String descricao;
    private Date data;
    private String local;
    private String titulo;


    
    public Bombeiro getBombeiros() {
        return bombeiros;
    }
    public void setBombeiros(Bombeiro bombeiros) {
        this.bombeiros = bombeiros;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return "Caso [bombeiros=" + bombeiros + ", descricao=" + descricao + ", data=" + data + ", local=" + local
                + ", titulo=" + titulo + "]";
    }

    
    

}
