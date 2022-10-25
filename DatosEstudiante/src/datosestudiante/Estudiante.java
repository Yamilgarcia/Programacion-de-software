/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosestudiante;

/**
 *
 * @author PC31-B5
 */
public class Estudiante {
    
    String nombre;
    String apellido;
    String Carrera;
    String nivel;

    public Estudiante(String nombre, String apellido, String Carrera, String nivel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Carrera = Carrera;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
    
}
