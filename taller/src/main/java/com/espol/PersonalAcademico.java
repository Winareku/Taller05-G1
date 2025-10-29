package com.espol;

public class PersonalAcademico extends Usuario {
    private String email;
    private String contenido;
    private String comentario;
    public PersonalAcademico (String usuario, String contrasena, String nombre, String apellido, String email, String contenido, String comentario){
            super(usuario, contrasena, nombre, apellido);
            this.email = email;
            this.contenido = contenido;
            this.comentario = comentario;
        }
    public String getEmail(String email){
        return this.email;
    }
    public String getCotenido(String contenido){
        return this.contenido;
    }
    public String getComentario(String comentario){
        return this.comentario;
    }
    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    public void reportarError(String email, String contenido){
        //Algo
    }
    public void solicitarAsesoramientoDelSistema(String email, String contenido){
        //Algo
    }
    public void comentarEnForo(Foro foro, String comentario){

    }
}
