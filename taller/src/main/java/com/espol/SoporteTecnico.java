package com.espol;
public class SoporteTecnico extends Usuario {
    public SoporteTecnico(String usuario, String contrasena, String nombre, String apellido){
            super(usuario, contrasena, nombre, apellido);
    }
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
