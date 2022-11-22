package br.ufrn.imd.domain.Pessoa;

public abstract class Pessoa {

    private String nome;
    private String rg;
    private int niAcesso;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public int getNiAcesso() {
        return niAcesso;
    }
    public void setNiAcesso(int niAcesso) {
        this.niAcesso = niAcesso;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", rg=" + rg + "]";
    }
    
}
