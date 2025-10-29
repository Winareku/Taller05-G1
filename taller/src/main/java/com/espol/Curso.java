package com.espol;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Curso {
    // Atributos
    private String id;
    private String nombre;
    private Boolean estadoDisponible;
    private ArrayList<Foro> foros;

    private ArrayList<Estudiante> estudiantesInscritos;
    private ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion;

    // Constructor
    public Curso(String id, String nombre, Boolean estadoDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.foros = new ArrayList<>();

    }

    // Getters y Setters
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public Boolean getEstadoDisponible() {return estadoDisponible;}
    public void setEstadoDisponible(Boolean estadoDisponible) {this.estadoDisponible = estadoDisponible;}
    public ArrayList<Foro> getForos() {return foros;}
    public void setForos(ArrayList<Foro> foros) {this.foros = foros;}
}
