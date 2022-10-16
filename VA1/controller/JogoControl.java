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
    public Jogo findJogoById(String idJogo) {
        Predicate<Jogo> filtroId = p -> p.getId().equalsIgnoreCase(idJogo);
        Jogo jogo = jogos.stream().filter(filtroId).findFirst().orElse(null);
        return jogo;
      }

}
