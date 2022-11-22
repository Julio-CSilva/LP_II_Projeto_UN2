package br.ufrn.imd.domain.Pessoa;

public class Bombeiro extends Pessoa{

    private String habilitacao;
    private String qualificacao;
    private String renepe;
    private int nivelBomb;
    private Assinatura assinatura;

    public Bombeiro() {
        this.setNiAcesso(1);
        Assinatura assinaturaNova = new Assinatura();
        this.assinatura = assinaturaNova;
    }

    public String getHabilitacao() {
        return habilitacao;
    }
    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }
    public String getQualificacao() {
        return qualificacao;
    }
    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }
    public String getRenepe() {
        return renepe;
    }
    public void setRenepe(String renepe) {
        this.renepe = renepe;
    }
    public int getNivelBomb() {
        return nivelBomb;
    }
    public void setNivelBomb(int nivelBomb) {
        this.nivelBomb = nivelBomb;
    }
    public Assinatura getAssinatura() {
        return assinatura;
    }
    

    @Override
    public String toString() {
        return "Bombeiro [nome=" + getNome() + ", rg=" + getRg() + "habilitacao=" + habilitacao + ", qualificacao=" + qualificacao + ", renepe=" + renepe
                + ", Nivel=" + nivelBomb + "]";
    }
    
}
