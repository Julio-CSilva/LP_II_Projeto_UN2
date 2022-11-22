package br.ufrn.imd.domain.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class SistemaGerenciamento {

    private List<Pessoa> pessoas;

    public SistemaGerenciamento() {
        pessoas = new ArrayList<Pessoa>();
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void addPessoas(Pessoa p) {
        this.pessoas.add(p);
    }

    public void cadastrarPessoa(Scanner sc){
        System.out.println("Quem você deseja cadastrar?\n1 - Gestor\n2 - Bombeiro\n3 - Civil");

        if(sc.nextInt() == 1){
            Gestor gestor = new Gestor();
            System.out.println("Digite o nome:");
            gestor.setNome(sc.nextLine());
            System.out.println("O RG:");
            gestor.setRg(sc.nextLine());
            addPessoas(gestor);
            System.out.println("Gestor \""+gestor.getNome()+"\" cadastrado!");

        } else if(sc.nextInt() == 2){
            Bombeiro bombe = new Bombeiro();
            System.out.println("Digite o nome:");
            bombe.setNome(sc.nextLine());
            System.out.println("O RG:");
            bombe.setRg(sc.nextLine());
            System.out.println("Sua Habilitação (como bombeiro):"); //profissão ocupada pelo bombeiro
            bombe.setHabilitacao(sc.nextLine());
            System.out.println("Suas Qualificações (separadas por virgula):"); //qualificações que o bombeiro possui
            bombe.setQualificacao(sc.nextLine());
            System.out.println("Numero do RENEPE:"); //Registro Nacional de Pessoal de Prevenção e Resposta às Emergências.
            bombe.setRenepe(sc.nextLine());
            System.out.println("Nivel do Bombeiro:");
            bombe.setNivelBomb(sc.nextInt());
            sc.nextLine();
            addPessoas(bombe);
            System.out.println("Bombeiro \""+bombe.getNome()+"\" cadastrado!");
            
        } else if(sc.nextInt() == 3){
            Civil civil = new Civil();
            System.out.println("Preencha os campos conforme necessario:");
            System.out.println("Digite o nome:");
            civil.setNome(sc.nextLine());
            System.out.println("O RG:");
            civil.setRg(sc.nextLine());
            System.out.println("O telefone:");
            civil.setTelefone(sc.nextLine());
            System.out.println("O endereço:");
            civil.setEndereco(sc.nextLine());
            addPessoas(civil);
            System.out.println("Civil \""+civil.getNome()+"\" cadastrado!");
        }
    }

    public Pessoa getBombeiro(){
        return pessoas.get(0);
    }
    public Pessoa getCivil(){
        return pessoas.get(1);
    }
    
    public void criarbombeiro(){
        Bombeiro bombe = new Bombeiro();
        bombe.setNome("Roberto");
        bombe.setRg("391238");
        bombe.setHabilitacao("74812748-124");
        bombe.setQualificacao("Socorrista");
        bombe.setRenepe("81938");
        bombe.setNivelBomb(2);
        addPessoas(bombe);

    }
    public void criarcivil(){
        Civil civil = new Civil();
        civil.setNome("Fulano");
        addPessoas(civil);
    }

    public boolean verificarAcesso(Pessoa p, int acesso){
        if(p.getNiAcesso() == acesso){
            return true;
        } else {
            return false;
        }
    }

    
    
}
