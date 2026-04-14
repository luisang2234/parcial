/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static org.junit.Assert.*;
import org.junit.Test;

public class ColegioTest {

    @Test
    public void testAgregarYListarEstudiante() {
        Colegio colegio = new Colegio();

        Estudiante e = new Estudiante();
        e.setNombre("Ana");
        e.setCodigo("2200001");
        e.setGrado("10");
        e.setPromedio(4.5);

        colegio.agregarPersona(e);

        String resultado = colegio.listarEstudiantes();

        assertTrue(resultado.contains("Ana"));
    }

    @Test
    public void testTotalPrestaciones() {
        Colegio colegio = new Colegio();

        Profesor p = new Profesor();
        p.setValorHora(20000);
        p.setHorasMes(100);

        colegio.agregarPersona(p);

        assertTrue(colegio.totalPrestaciones() > 0);
    }
    @Test
public void testAgregarEstudiante() {
    Colegio colegio = new Colegio();

    Estudiante e = new Estudiante();
    e.setNombre("Ana");
    e.setPromedio(4.5);

    colegio.agregarPersona(e);

    String resultado = colegio.listarEstudiantes();

    assertTrue(resultado.contains("Ana"));
}
}