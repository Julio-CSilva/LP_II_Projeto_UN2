package br.ufrn.imd.main;

import java.util.Scanner;

import br.ufrn.imd.domain.Alerta.GerenciamentoAlerta;
//import br.ufrn.imd.domain.Boletim.GerenciamentoBoletim;
//import br.ufrn.imd.domain.Escala.GerenciamentoEscala;
import br.ufrn.imd.domain.Pessoa.Bombeiro;
import br.ufrn.imd.domain.Pessoa.Civil;
import br.ufrn.imd.domain.Pessoa.SistemaGerenciamento;
//import br.ufrn.imd.domain.Processos.GerenciamentoProcessos;
import br.ufrn.imd.domain.Solicitacao.GerenciamentoSolicitacao;

public class VisaoSistema {

    public static void main(String[] args) {
        GerenciamentoAlerta gAlerta = new GerenciamentoAlerta();
        //GerenciamentoBoletim gBoletim = new GerenciamentoBoletim();
        //GerenciamentoEscala gEscala = new GerenciamentoEscala();
        //GerenciamentoProcessos gProcessos = new GerenciamentoProcessos();
        GerenciamentoSolicitacao gSolicitacao = new GerenciamentoSolicitacao();
        SistemaGerenciamento sg = new SistemaGerenciamento();

        Scanner sc = new Scanner(System.in);
			
		boolean sistema = true;

        sg.criarbombeiro();
        gAlerta.criarCaso((Bombeiro) sg.getBombeiro());
        sg.criarcivil();
        gSolicitacao.criarChamado((Civil) sg.getCivil());

        try {
			while(sistema == true) {
                System.out.println("SISTEMA DE GERENCIAMENTO DE BOMBEIROS\nSelecione a opção desejada:"
                +"\n1 - Ver Alertas\n2 - Ver Solicitações\n3 - Realizar Cadastro");

                switch(sc.nextLine()) {
                    case "1":
                    System.out.println(gAlerta.toString());
                    break;
                    case "2":
                    gSolicitacao.verSolicitacoes();
                    break;
                    case "3":
                    sg.cadastrarPessoa(sc);
                    break;
                    default:
                    System.out.println("Opção invalida!");
                    break;
                }
            }

        } finally {
            sc.close();
        }


    }
    
}
