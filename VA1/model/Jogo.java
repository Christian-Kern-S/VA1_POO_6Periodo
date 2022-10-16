package model;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private Integer id;
    private String nome;
    private String plataforma;
    private List<Avaliacao> avaliacoes;
    public Jogo(String nome, String plataforma) {
        this.avaliacoes = new ArrayList<>();
        this.id = 1;
        this.nome = nome;
        this.plataforma = plataforma;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
    
    public Double mediaAvalicao(){
        Double medAv = (double) 0;
        for(int i = 0; i < avaliacoes.size(); i++){
            medAv += avaliacoes.get(i).getNota();
        }
        return medAv/avaliacoes.size();
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }


    
    @Override
    public String toString() {
        return "######## Jogo #######\n"
                + "# ID: " + getId()
                + "\n# NOME: " + getNome()
                + "\n# PLATAORMA: " + getPlataforma()
                + "\n# AVALIAÇÕES: " + mediaAvalicao()
                + "\n##################################";
    }
}
