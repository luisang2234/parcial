/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Colegio;
import static org.junit.Assert.*;
import org.junit.Test;

public class ControladorColegioTest {

    @Test
    public void testAgregarEstudiante() {
        Colegio colegio = new Colegio();
        ControladorColegio controlador = new ControladorColegio(colegio, null);

        controlador.agregarEstudiante(
                "Luis",
                "Centro",
                "1234567890",
                "2005-01-01",
                "2200001",
                "11",
                4.2
        );

        String resultado = controlador.obtenerListadoEstudiantes();

        assertTrue(resultado.contains("Luis"));
    }

    @Test
    public void testAgregarProfesor() {
        Colegio colegio = new Colegio();
        ControladorColegio controlador = new ControladorColegio(colegio, null);

        controlador.agregarProfesor(
                "Carlos",
                "Centro",
                "1234567890",
                "1990-01-01",
                "12345678",
                "Matematicas",
                20000,
                100
        );

        String resultado = controlador.obtenerListadoProfesores();

        assertTrue(resultado.contains("Carlos"));
    }
}