package model;

import java.util.*;

public class Jogo {
    private int id;
    private String nome;
    private String plataforma;
    private List<Avaliacao> avaliacoes;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Double mediaAvalicao(){
        return mediaAvalicao();
    }
   
    @Override
    public String toString() {
        return "Jogo [id=" + id + ", nome=" + nome + ", plataforma=" + plataforma + ", avaliacoes=" + avaliacoes + "]";
    }
    
}
