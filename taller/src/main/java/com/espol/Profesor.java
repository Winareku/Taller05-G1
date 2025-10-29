package com.espol;

import java.util.ArrayList;

public class Profesor extends Usuario {
    // Atributos
    private ArrayList<Curso> cursosACargo;

    // Constructor
    public Profesor(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        this.cursosACargo = new ArrayList<>();
    }

    // Métodos
    public void cargarActividadSumativa() {}

    public void calificarActividadSumativa() {}

    public void aceptarInscripcion() {}

    public void crearNuevoForo() {}

    // Getters y Setters
    public ArrayList<Curso> getCursosACargo() {return cursosACargo;}
    public void setCursosACargo(ArrayList<Curso> cursosACargo) {this.cursosACargo = cursosACargo;}
}
