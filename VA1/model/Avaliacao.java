package model;

public class Avaliacao {
    private String nomeAvaliador;
    private Double nota;

    public Avaliacao() {
    }

    public Avaliacao(String nomeAvaliador, Double nota) {
        this.nomeAvaliador = nomeAvaliador;
        this.nota = nota;
    }

    public String getNomeAvaliador() {
        return nomeAvaliador;
    }

    public void setNomeAvaliador(String nomeAvaliador) {
        this.nomeAvaliador = nomeAvaliador;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Avaliacao findAvaliacaoByIdNomeAvaliador(String lerString) {
        return null;
    }

    
}


    

