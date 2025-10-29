package com.espol;

public class SoporteTecnico extends Usuario {
    // Constructor
    public SoporteTecnico(String usuario, String contrasena, String nombre, String apellido){
            super(usuario, contrasena, nombre, apellido);
    }

    // Métodos
    public void brindarAsistencia(Usuario usuario){
        //Algo
    }

    public void resolverProblemaTecnico(Usuario usuario){
        //Algo
    }
    
    public void derivarProblemaDeGestion(Administrador administrador){
        //Algo
    }
}
