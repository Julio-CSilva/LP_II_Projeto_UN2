package br.ufrn.imd.domain.Pessoa;

public class Civil extends Pessoa{

    private String telefone;
    private String endereco;

    public Civil() {
        this.setNiAcesso(0);
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Civil [nome=" + getNome() + ", rg=" + getRg() + "telefone=" + telefone + ", endereco=" + endereco + "]";
    }

    

}
