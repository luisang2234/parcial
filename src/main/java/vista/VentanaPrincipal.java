/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import controlador.ControladorColegio;
import javax.swing.JOptionPane;


/**
 *
 * @author LENOVO
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private ControladorColegio controlador;
    
    public VentanaPrincipal(){
        initComponents();
    }
      public void setControlador(ControladorColegio controlador) {
        this.controlador = controlador;
    }
        @SuppressWarnings("unchecked")
    private void initComponents(){
         btnAgregarEstudiante = new javax.swing.JButton();
        btnAgregarProfesor = new javax.swing.JButton();
        btnListarEstudiantes = new javax.swing.JButton();
        btnListarProfesores = new javax.swing.JButton();
    }

    
    
}
