/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Estudiante extends Persona {
    private String codigo;
    private String grado;
    private double promedio;
    
    public Estudiante(){
    
}
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public double getPromedio() {
        return promedio;
    }
 @Override
public String mostrarDatos() {
    return super.mostrarDatos() +
            ", Codigo: " + codigo +
            ", Grado:" + grado +
            ", Promedio" + promedio;
}
}