/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controlador.ControladorColegio;
import modelo.Colegio;
import vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        Colegio modelo = new Colegio();
        VentanaPrincipal vista = new VentanaPrincipal();
 ControladorColegio controlador = new ControladorColegio(modelo, vista);
 vista.setControlador(controlador);