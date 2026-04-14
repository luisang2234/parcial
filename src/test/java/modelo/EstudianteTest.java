/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static org.junit.Assert.*;
import org.junit.Test;

public class EstudianteTest {

    @Test
    public void testSetGetPromedio() {
        Estudiante e = new Estudiante();

        e.setPromedio(4.5);

        assertEquals(4.5, e.getPromedio(), 0.01);
    }

    @Test
    public void testCodigoMayorA2100000() {
        int codigo = 2200000;

        assertTrue(codigo > 2100000);
    }

    @Test
    public void testPromedioValido() {
        double promedio = 3.8;

        assertTrue(promedio >= 0 && promedio <= 5);
    }
}
