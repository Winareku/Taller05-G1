package com.espol;
import java.util.ArrayList;


public class Usuario {
    // Atributos
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;
    protected ArrayList<String> incidentes;

    // Constructor
    public Usuario(String usuario, String contrasena, String nombre, String apellido){
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido; 
        this.incidentes = new ArrayList<>();
    }

    // Métodos
    protected boolean logIn(){
        return true;
    }

    protected boolean logOut(){
        return true;
    }

    // Getters y Setters
    public ArrayList<String> getIncidentes(){return incidentes;}
    public String getUsuario(){return this.usuario;}
    public String getContrasena(){return this.contrasena;}
    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}

    public void setUsuario(String usuario){this.usuario = usuario;}
    public void setContrasena(String contrasena){this.contrasena = contrasena;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setApellido(String apellido){this.apellido = apellido;}
}
