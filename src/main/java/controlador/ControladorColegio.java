/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Colegio;
import modelo.Estudiante;
import modelo.Profesor;
import vista.VentanaPrincipal;


/**
 *
 * @author LENOVO
 */
public class ControladorColegio {
    private Colegio colegio;
    private VentanaPrincipal vista;

    public ControladorColegio(Colegio colegio, VentanaPrincipal vista) {
        this.colegio = colegio;
        this.vista = vista;
    }
     public void agregarEstudiante(
            String nombre,
            String direccion,
            String telefono,
            String fechaNacimiento,
            String codigo,
            String grado,
            double promedio) {

        Estudiante e = new Estudiante();
        e.setNombre(nombre);
        e.setDireccion(direccion);
        e.setTelefono(telefono);
        e.setFechaNacimiento(fechaNacimiento);
        e.setCodigo(codigo);
        e.setGrado(grado);
        e.setPromedio(promedio);

        colegio.agregarPersona(e);
    }
      public void agregarProfesor(
            String nombre,
            String direccion,
            String telefono,
            String fechaNacimiento,
            String cedula,
            String area,
            double valorHora,
            int horasMes) {

        Profesor p = new Profesor();
        p.setNombre(nombre);
        p.setDireccion(direccion);
        p.setTelefono(telefono);
        p.setFechaNacimiento(fechaNacimiento);
        p.setCedula(cedula);
        p.setArea(area);
        p.setValorHora(valorHora);
        p.setHorasMes(horasMes);

        colegio.agregarPersona(p);
    }
      
    public String obtenerListadoEstudiantes() {
        return colegio.listarEstudiantes();
    }

    public String obtenerListadoProfesores() {
        return colegio.listarProfesoresOrdenados() +
               "\nTOTAL PRESTACIONES: " + colegio.totalPrestaciones();
    }
}
