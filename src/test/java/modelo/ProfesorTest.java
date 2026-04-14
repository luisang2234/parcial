/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProfesorTest {

    @Test
    public void testCalcularPagoMensual() {
        Profesor p = new Profesor();

        p.setValorHora(20000);
        p.setHorasMes(100);

        assertEquals(2600000, p.calcularPagoMensual(), 0.01);
    }

    @Test
    public void testCalcularPrestaciones() {
        Profesor p = new Profesor();

        p.setValorHora(20000);
        p.setHorasMes(100);

        assertEquals(494000, p.calcularPrestaciones(), 0.01);
    }

    @Test
    public void testCalcularSalarioTotal() {
        Profesor p = new Profesor();

        p.setValorHora(20000);
        p.setHorasMes(100);

        assertEquals(3094000, p.calcularSalarioTotal(), 0.01);
    }
}