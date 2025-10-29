package com.espol;
import java.util.ArrayList;
public class Estudiante extends PersonalAcademico{
    private ArrayList<String> cursosInscritos;
    public Estudiante (String usuario, String contrasena, String nombre, String apellido, String email, String contenido, String comentario, ArrayList<String> cursosInscritos){
            super(usuario, contrasena, nombre, apellido, email, contenido, comentario);
            this.cursosInscritos = new ArrayList<>();
        }
    public ArrayList<String> getCursosInscritos(){
        return cursosInscritos;
    }
    public void solicitarInscripcionCurso(Curso curso){
        //ALgo
    }
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //Algo
    }

}
