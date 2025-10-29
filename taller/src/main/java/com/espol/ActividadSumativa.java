package com.espol;

import java.util.Date;

public class ActividadSumativa {
    // Atributos
    private String titulo;
    private Date fechaDeEntrega;
    private float puntajeMaximo;
    private String contenido;
    private float calificacion;
    private String id;

    // Constructor
    public ActividadSumativa(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id) {
        this.titulo = titulo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.puntajeMaximo = puntajeMaximo;
        this.contenido = contenido;
        this.calificacion = calificacion;
        this.id = id;
    }

    // Getters y Setters
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public Date getFechaDeEntrega() {return fechaDeEntrega;}
    public void setFechaDeEntrega(Date fechaDeEntrega) {this.fechaDeEntrega = fechaDeEntrega;}
    public float getPuntajeMaximo() {return puntajeMaximo;}
    public void setPuntajeMaximo(float puntajeMaximo) {this.puntajeMaximo = puntajeMaximo;}
    public String getContenido() {return contenido;}
    public void setContenido(String contenido) {this.contenido = contenido;}
    public float getCalificacion() {return calificacion;}
    public void setCalificacion(float calificacion) {this.calificacion = calificacion;}
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
}
