package controller;

import java.util.*;

import model.*;

public class JogoControl {

    private List<Jogo> jogos;

    public JogoControl() {
        jogos = new ArrayList<Jogo>();
    }

    public void adicionarJogo(Jogo jogo) {
        this.jogos.add(jogo);
    }

    public void listarJogo() {
        this.jogos.forEach(j -> {
            System.out.println(j);
        });
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

    public Jogo findJogoById(Integer idJogo) {
        return jogos.stream().filter(j -> j.getId().equals(idJogo)).findFirst().orElse(null);
    }

    public int getSize() {
        return jogos.size();
    }

}
