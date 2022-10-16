package controller;

import java.util.*;
import java.util.function.Predicate;



import model.*;

public class JogoControl {
   
    private List<Jogo> jogos;
    private Jogo jogo;

    public JogoControl() {
        jogos = new ArrayList<Jogo>();
    }

    public void adicionarJogo(Jogo jogo) {
    
        this.jogos.add(jogo);
    }

    public void listarJogo() {
        jogos.forEach(a -> {
            System.out.println(a);
        });
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }
    public Jogo findJogoById(Integer idJogo) {
        Predicate<Jogo> id_inserido = g -> g.getId().equalsIgnoreCase(idJogo);
        Jogo jogo = jogos.stream().filter(g -> g.getId() == id_inserido).findFirst().orElse(null);
        return jogo;
      }



}
