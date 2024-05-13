package com.example.demowebappivan;

public class Saluto {
    private String nome;
    private String regione;
    private String salutoCompleto;

    public Saluto (String regione, String nome) {
        this.nome = nome;
        this.regione = regione;
        this.salutoCompleto = "Ciao, " + nome + "! Com'è il tempo in " + regione + "?";
    }

    public String getNome() {
        return this.nome;
    }

    public String getRegione() {
        return this.regione;
    }

    public String getSalutoCompleto() {
        return this.salutoCompleto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }
}