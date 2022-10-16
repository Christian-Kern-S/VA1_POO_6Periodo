package model;

import java.util.List;

public class Jogo {
    private Integer id;
    private String nome;
    private String plataforma;
    private List<Avaliacao> avaliacoes;
    public Jogo(boolean b, int lerInt, String lerString, String string) {
    }
    public int getId() {
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
    int sum = 0;
    public Double mediaAvalicao(){
        return mediaAvalicao();
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
        return "######## Professor #######\n"
                + "ID: " + getId()
                + "\n# NOME: " + getNome()
                + "\n# PLATAORMA: " + getPlataforma()
                + "\n# AVALIAÇÕES: " + mediaAvalicao()
                + "\n##################################";
    }
}
