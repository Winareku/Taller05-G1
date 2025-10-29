package com.espol;

import java.util.ArrayList;

public class PersonalAcademico extends Usuario {
    // Atributos
    private String email;
    private String contenido;
    private String comentario;

    protected ArrayList<String> incidentes;

    // Constructor
    public PersonalAcademico (String usuario, String contrasena, String nombre, String apellido, String email, String contenido, String comentario){
            super(usuario, contrasena, nombre, apellido);
            this.email = email;
            this.contenido = contenido;
            this.comentario = comentario;
    }

    // Métodos
    public void reportarError(String email, String contenido){
        //Algo
    }

    public void solicitarAsesoramientoDelSistema(String email, String contenido){
        //Algo
    }

    public void comentarEnForo(Foro foro, String comentario){
        //Algo
    }

    // Getters y Setters
    public String getEmail(){return this.email;}
    public String getContenido(){return this.contenido;}
    public String getComentario(){return this.comentario;}
    public ArrayList<String> getIncidentes(){return this.incidentes;}

    public void setComentario(String comentario){this.comentario = comentario;}
    public void setEmail(String email){this.email = email;}
    public void setContenido(String contenido){this.contenido = contenido;}
    public void setIncidentes(ArrayList<String> incidentes){this.incidentes = incidentes;}
}
