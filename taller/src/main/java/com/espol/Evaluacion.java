package com.espol;

import java.util.Date;

public class Evaluacion extends ActividadSumativa {
    // Atributos
    private int limiteDeTiempo;

    // Constructor
    public Evaluacion(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id, int limiteDeTiempo) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
        this.limiteDeTiempo = limiteDeTiempo;
    }

    // Getters y Setters
    public int getLimiteDeTiempo() {return limiteDeTiempo;}
    public void setLimiteDeTiempo(int limiteDeTiempo) {this.limiteDeTiempo = limiteDeTiempo;}
}
