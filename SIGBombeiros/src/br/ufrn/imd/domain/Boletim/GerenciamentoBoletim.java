package br.ufrn.imd.domain.Boletim;

import java.util.ArrayList;
import java.util.List;
import br.ufrn.imd.domain.Alerta.Caso;

public class GerenciamentoBoletim {
    
    private Caso ultimoCaso;
    private List<Noticia> noticias;

    public GerenciamentoBoletim(){
        noticias = new ArrayList<Noticia>();
    }
    
    //public Noticia criarNoticia(){}

    public void editarNoticia(Noticia noticia){

    }

    //public Noticia excluirNoticia(Noticia noticia){}

    public void mudarUltimoCaso(Caso caso){

    }

    public void visualizarNoticias(){

    }

    //public Boolean verificarAcesso(Pessoa pessoa){}

    public Caso getUltimoCaso() {
        return ultimoCaso;
    }
    public void setUltimoCaso(Caso ultimoCaso) {
        this.ultimoCaso = ultimoCaso;
    }
    public List<Noticia> getNoticias() {
        return noticias;
    }
    public void setNoticias(ArrayList<Noticia> noticias) {
        this.noticias = noticias;
    }

    

}
