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
         txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtGrado = new javax.swing.JTextField();
        txtPromedio = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtValorHora = new javax.swing.JTextField();
        txtHorasMes = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextArea();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
             btnAgregarEstudiante.setText("Agregar Estudiante");
        btnAgregarProfesor.setText("Agregar Profesor");
        btnListarEstudiantes.setText("Listar Estudiantes");
        btnListarProfesores.setText("Listar Profesores");

        btnAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEstudiante();
            }
        });
         btnAgregarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProfesor();
            }
        });
          btnListarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado.setText(controlador.obtenerListadoEstudiantes());
            }
        });
          btnListarProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultado.setText(controlador.obtenerListadoProfesores());
            }
        });
    }
             private void agregarEstudiante() {
        try {
            controlador.agregarEstudiante(
                    txtNombre.getText(),
                    txtDireccion.getText(),
                    txtTelefono.getText(),
                    txtFechaNacimiento.getText(),
                    txtCodigo.getText(),
                    txtGrado.getText(),
                    Double.parseDouble(txtPromedio.getText())
            );
            JOptionPane.showMessageDialog(this, "Estudiante agregado correctamente");
            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar estudiante: " + e.getMessage());
        }
    }
             private void agregarProfesor() {
        try {
            controlador.agregarProfesor(
                    txtNombre.getText(),
                    txtDireccion.getText(),
                    txtTelefono.getText(),
                    txtFechaNacimiento.getText(),
                    txtCedula.getText(),
                    txtArea.getText(),
                    Double.parseDouble(txtValorHora.getText()),
                    Integer.parseInt(txtHorasMes.getText())
            );
            JOptionPane.showMessageDialog(this, "Profesor agregado correctamente");
            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar profesor: " + e.getMessage());
        }
    }
             private void limpiarCampos() {
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtFechaNacimiento.setText("");
        txtCodigo.setText("");
        txtGrado.setText("");
        txtPromedio.setText("");
        txtCedula.setText("");
        txtArea.setText("");
        txtValorHora.setText("");
        txtHorasMes.setText("");
    }
             private javax.swing.JButton btnAgregarEstudiante;
    private javax.swing.JButton btnAgregarProfesor;
    private javax.swing.JButton btnListarEstudiantes;
    private javax.swing.JButton btnListarProfesores;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtPromedio;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtValorHora;
    private javax.swing.JTextField txtHorasMes;
    private javax.swing.JTextArea txtResultado;
}
          
          



      
    

    
    

