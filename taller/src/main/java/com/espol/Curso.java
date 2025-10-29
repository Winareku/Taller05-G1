package com.espol;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Curso {
    // Atributos
    private String id;
    private String nombre;
    private Boolean estadoDisponible;
    private ArrayList<Foro> foros;

    private ArrayList<>

    // Constructor
    public Curso(String id, String nombre, Boolean estadoDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.foros = new ArrayList<>();

    }
}
