/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author LENOVO
 */
public class Colegio {
    private ArrayList<Persona> Personas;
    
    public Colegio() {
        Personas = new ArrayList<>();
      
    }
     public ArrayList<Persona> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.Personas = personas;
    }
    public void agregarPersona(Persona p){
        Personas.add(p);
    }
    public String listarEstudiantes(){
        StringBuilder sb= new
            StringBuilder();
        for (Persona p : Personas){
            if (p instanceof Estudiante) {
                sb.append(p.mostrarDatos()).append("\n");
            }
        }
        return  sb.toString();
    }
    public String listarProfesoresOrdenados(){
        ArrayList<Profesor> profesores = new ArrayList<>();
        for (Persona p : Personas) {
            if(p instanceof Profesor){
                profesores.add((Profesor)p);
            }
        }
        Collections.sort(profesores, new Comparator<Profesor>() {
            @Override
            public int compare(Profesor p1, Profesor p2) {
                return Double.compare(p2.calcularSalarioTotal(), p1.calcularSalarioTotal());
            }
        });
        StringBuilder sb = new
            StringBuilder();
        for (Profesor prof : profesores) {
              sb.append(prof.mostrarDatos()).append("\n");
            
        }
        return sb.toString();

    }
    public double totalPrestaciones(){
        double total = 0;
        for (Persona  p : Personas){
            if(p instanceof Profesor) {
                total += ((Profesor)p).calcularPrestaciones();
            }
        }
        return total;
    }
    
}
