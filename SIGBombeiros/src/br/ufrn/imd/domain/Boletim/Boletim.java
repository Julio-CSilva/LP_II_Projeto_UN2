package br.ufrn.imd.domain.Boletim;

import java.util.ArrayList;
import br.ufrn.imd.domain.Alerta.Caso;

import br.ufrn.imd.domain.Pessoa.Pessoa;

public class Boletim {
    
    private Caso ultimoCaso;
    private ArrayList<Noticia> noticias = new ArrayList<>();
    
    public Noticia criarNoticia(){

    }

    public void editarNoticia(Noticia noticia){

    }

    public Noticia excluirNoticia(Noticia noticia){

    }

    public void mudarUltimoCaso(Caso caso){

    }

    public void visualizarNoticias(){

    }

    public Boolean verificarAcesso(Pessoa pessoa){
        
    }

    public Caso getUltimoCaso() {
        return ultimoCaso;
    }
    public void setUltimoCaso(Caso ultimoCaso) {
        this.ultimoCaso = ultimoCaso;
    }
    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }
    public void setNoticias(ArrayList<Noticia> noticias) {
        this.noticias = noticias;
    }

    

}
