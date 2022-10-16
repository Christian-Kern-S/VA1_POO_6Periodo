package controller;

import java.util.List;
import java.util.Scanner;

import model.Avaliacao;
import model.Jogo;

public class GlobalControl {

    private JogoControl jogos;
    private Avaliacao avaliacoes;
    

    public String lerString(String msg) {
        System.out.print(msg);
        return sc.next();
    }

    public int lerInt(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    Scanner sc = new Scanner(System.in);
    
    
    public void AdicionarJogo() {
        Jogo jogo = construirJogo();
        this.jogos.adicionarJogo(jogo);    
        System.out.println("JogoAdicionado com sucesso!");
      }



    private Jogo construirJogo() {
        return new Jogo(  
                lerInt("Digite o id do jogo"),
                lerString("Digite o nome do jogo"),
                lerString("Digite a plataforma do jogo"));
    }

    public void ListarJogos() {
        this.jogos.listarJogo();
      }

    public void AdicionarAvaliacaoNoJogo() {
        Avaliacao avaliacao = buscarAvaliacao();
        List<Jogo> lista = this.jogos.getJogos();
        Jogo jogo = buscarJogo();
        Avaliacao nome = avaliacao.findAvaliacaoByIdNomeAvaliador(avaliacao.getNomeAvaliador());
        if (nome != null) {
          System.out.println("Avaliação deste avaliador ja está adicionada nesse curso!");
          return;
        }
        lista.remove(jogo);
        jogo.adicionarAvaliacao(avaliacao);
        lista.add(jogo);
        this.jogos.setJogos(lista);
        System.out.println("Nova materia cadastrada ao curso " + jogo.getNome());
      }

      

      private Jogo buscarJogo() {
        
        Jogo jogo = null;
        while (jogo == null) {
          jogo = this.jogos.findJogoById(lerString("Digite o id do jogo: "));
          if (jogo == null) {
            System.out.println("Jogo não encontrado, tente novamente!");
          }
        }
        return jogo;
      }

      private Avaliacao buscarAvaliacao() {
        
        Avaliacao avaliacao = null;
        while (avaliacao == null) {
          avaliacao = this.avaliacoes.findAvaliacaoByIdNomeAvaliador(lerString("Digite o nome do avaliador: "));
          if (avaliacao == null) {
            System.out.println("Avaliador não encontrado, tente novamente!");
          }
        }
        return avaliacao;
      }
}
