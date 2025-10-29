package com.espol;

public class Foro {
    // Atributos
    private String id;
    private String tematica;
    private int numeroDeComentarios;

    // Constructor
    public Foro(String id, String tematica, int numeroDeComentarios) {
        this.id = id;
        this.tematica = tematica;
        this.numeroDeComentarios = numeroDeComentarios;
    }

    // Getters y Setters
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getTematica() {return tematica;}
    public void setTematica(String tematica) {this.tematica = tematica;}
    public int getNumeroDeComentarios() {return numeroDeComentarios;}
    public void setNumeroDeComentarios(int numeroDeComentarios) {this.numeroDeComentarios = numeroDeComentarios;}
}