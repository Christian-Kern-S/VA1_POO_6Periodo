package controller;

import java.util.List;
import java.util.Scanner;

import model.Avaliacao;
import model.Jogo;

public class GlobalControl {

  private JogoControl jogos;

  public GlobalControl() {
    this.jogos = new JogoControl();
  }

  public String lerString(String msg) {
    System.out.print(msg);
    return sc.next();
  }

  public Integer lerInt(String msg) {
    System.out.print(msg);
    return sc.nextInt();
  }

  public Double lerDouble(String msg) {
    System.out.println(msg);
    return sc.nextDouble();
  }

  Scanner sc = new Scanner(System.in);

  public void AdicionarJogo() {
    Jogo jogo = construirJogo();
    jogo.setId(jogos.getSize()+1);
    this.jogos.adicionarJogo(jogo);
    System.out.println("JogoAdicionado com sucesso!");
  }

  private Jogo construirJogo() {
    return new Jogo(
        lerString("Digite o nome do jogo: "),
        lerString("Digite a plataforma do jogo: "));
  }

  public void ListarJogos() {
    this.jogos.listarJogo();
  }

  public void AdicionarAvaliacaoNoJogo() {
    Jogo jogo = buscarJogo();
    if (jogo == null) {
      System.out.println("O jogo não foi encontrado");
      return;
    }
    Avaliacao avaliacao = new Avaliacao(
        lerString("Nome do avaliador: "),
        lerDouble("Informe a nota: "));
    List<Avaliacao> lista = jogo.getAvaliacoes();
    lista.add(avaliacao);
  }

  private Jogo buscarJogo() {
    Integer id = lerInt("Digite o ID:"); 
    return this.jogos.findJogoById(id);
  }

}
