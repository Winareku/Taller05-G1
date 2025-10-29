package com.espol;

import java.util.ArrayList;
import java.util.Date;

public class Indicente {
    // Atributos
    protected int id;
    protected Date fecha;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected ArrayList<String> log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;

    private Usuario usuario_responsable;

    // Constructor
    public Indicente(int id, Date fecha, String estado, String titulo, String descripcion, ArrayList<String> log_actualizaciones, Date fecha_cerrado, String tipo, Usuario usuario_responsable) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrado = fecha_cerrado;
        this.tipo = tipo;
        this.usuario_responsable = usuario_responsable;
    }

    // Getters y Setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public Date getFecha() {return fecha;}
    public void setFecha(Date fecha) {this.fecha = fecha;}
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public ArrayList<String> getLog_actualizaciones() {return log_actualizaciones;}
    public void setLog_actualizaciones(ArrayList<String> log_actualizaciones) {this.log_actualizaciones = log_actualizaciones;}
    public Date getFecha_cerrado() {return fecha_cerrado;}
    public void setFecha_cerrado(Date fecha_cerrado) {this.fecha_cerrado = fecha_cerrado;}
    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public Usuario getUsuario_responsable() {return usuario_responsable;}
    public void setUsuario_responsable(Usuario usuario_responsable) {this.usuario_responsable = usuario_responsable;}
}
