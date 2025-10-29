package com.espol;

import java.util.Date;

public class Tarea extends ActividadSumativa {
    // Atributos
    private Date fechaDePublicacion;

    // Constructor
    public Tarea(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id, Date fechaDePublicacion) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
        this.fechaDePublicacion = fechaDePublicacion;
    }

    // Getters y Setters
    public Date getFechaDePublicacion() {return fechaDePublicacion;}
    public void setFechaDePublicacion(Date fechaDePublicacion) {this.fechaDePublicacion = fechaDePublicacion;}
}
