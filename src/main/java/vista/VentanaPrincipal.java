/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorColegio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

    private ControladorColegio controlador;

    private JTextField txtNombre;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JTextField txtFechaNacimiento;
    private JTextField txtCodigo;
    private JTextField txtGrado;
    private JTextField txtPromedio;
    private JTextField txtCedula;
    private JTextField txtArea;
    private JTextField txtValorHora;
    private JTextField txtHorasMes;

    private JTextArea txtResultado;

    private JButton btnAgregarEstudiante;
    private JButton btnAgregarProfesor;
    private JButton btnListarEstudiantes;
    private JButton btnListarProfesores;

    public VentanaPrincipal() {
        initComponents();
    }

    public void setControlador(ControladorColegio controlador) {
        this.controlador = controlador;
    }

    private void initComponents() {
        setTitle("Sistema Colegio MVC");
        setSize(760, 620);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 120, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(140, 20, 180, 25);
        add(txtNombre);

        JLabel lblDireccion = new JLabel("Direccion:");
        lblDireccion.setBounds(20, 55, 120, 25);
        add(lblDireccion);

        txtDireccion = new JTextField();
        txtDireccion.setBounds(140, 55, 180, 25);
        add(txtDireccion);

        JLabel lblTelefono = new JLabel("Telefono:");
        lblTelefono.setBounds(20, 90, 120, 25);
        add(lblTelefono);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(140, 90, 180, 25);
        add(txtTelefono);

        JLabel lblFechaNacimiento = new JLabel("Fecha Nac:");
        lblFechaNacimiento.setBounds(20, 125, 120, 25);
        add(lblFechaNacimiento);

        txtFechaNacimiento = new JTextField();
        txtFechaNacimiento.setBounds(140, 125, 180, 25);
        add(txtFechaNacimiento);

        JLabel lblCodigo = new JLabel("Codigo:");
        lblCodigo.setBounds(20, 160, 120, 25);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(140, 160, 180, 25);
        add(txtCodigo);

        JLabel lblGrado = new JLabel("Grado:");
        lblGrado.setBounds(20, 195, 120, 25);
        add(lblGrado);

        txtGrado = new JTextField();
        txtGrado.setBounds(140, 195, 180, 25);
        add(txtGrado);

        JLabel lblPromedio = new JLabel("Promedio:");
        lblPromedio.setBounds(20, 230, 120, 25);
        add(lblPromedio);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(140, 230, 180, 25);
        add(txtPromedio);

        JLabel lblCedula = new JLabel("Cedula:");
        lblCedula.setBounds(380, 20, 120, 25);
        add(lblCedula);

        txtCedula = new JTextField();
        txtCedula.setBounds(500, 20, 180, 25);
        add(txtCedula);

        JLabel lblArea = new JLabel("Area:");
        lblArea.setBounds(380, 55, 120, 25);
        add(lblArea);

        txtArea = new JTextField();
        txtArea.setBounds(500, 55, 180, 25);
        add(txtArea);

        JLabel lblValorHora = new JLabel("Valor Hora:");
        lblValorHora.setBounds(380, 90, 120, 25);
        add(lblValorHora);

        txtValorHora = new JTextField();
        txtValorHora.setBounds(500, 90, 180, 25);
        add(txtValorHora);

        JLabel lblHorasMes = new JLabel("Horas Mes:");
        lblHorasMes.setBounds(380, 125, 120, 25);
        add(lblHorasMes);

        txtHorasMes = new JTextField();
        txtHorasMes.setBounds(500, 125, 180, 25);
        add(txtHorasMes);

        btnAgregarEstudiante = new JButton("Agregar Estudiante");
        btnAgregarEstudiante.setBounds(380, 180, 180, 30);
        add(btnAgregarEstudiante);

        btnAgregarProfesor = new JButton("Agregar Profesor");
        btnAgregarProfesor.setBounds(380, 220, 180, 30);
        add(btnAgregarProfesor);

        btnListarEstudiantes = new JButton("Listar Estudiantes");
        btnListarEstudiantes.setBounds(380, 260, 180, 30);
        add(btnListarEstudiantes);

        btnListarProfesores = new JButton("Listar Profesores");
        btnListarProfesores.setBounds(380, 300, 180, 30);
        add(btnListarProfesores);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        JScrollPane scroll = new JScrollPane(txtResultado);
        scroll.setBounds(20, 350, 700, 200);
        add(scroll);

        btnAgregarEstudiante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEstudiante();
            }
        });

        btnAgregarProfesor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarProfesor();
            }
        });

        btnListarEstudiantes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (controlador != null) {
                    txtResultado.setText(controlador.obtenerListadoEstudiantes());
                }
            }
        });

        btnListarProfesores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (controlador != null) {
                    txtResultado.setText(controlador.obtenerListadoProfesores());
                }
            }
        });
    }

    private void agregarEstudiante() {
       

    String nombre = txtNombre.getText();
    String promedioTxt = txtPromedio.getText();
    String telefono = txtTelefono.getText();

if (!telefono.matches("\\d{10,}")) {
    JOptionPane.showMessageDialog(this, "El teléfono debe tener mínimo 10 números");
    return;
}

    if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        JOptionPane.showMessageDialog(this, "Nombre solo letras");
        return;
    }

    double promedio;

    try {
        promedio = Double.parseDouble(promedioTxt);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Colocar bien promedio");
        return;
    }

    if (promedio < 0 || promedio > 5) {
        JOptionPane.showMessageDialog(this, "Colocar bien promedio");
        return;
    }

    controlador.agregarEstudiante(
            nombre,
            txtDireccion.getText(),
            txtTelefono.getText(),
            txtFechaNacimiento.getText(),
            txtCodigo.getText(),
            txtGrado.getText(),
            promedio
            
    );

    JOptionPane.showMessageDialog(this, "Estudiante agregado correctamente");
    limpiarCampos();
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
            JOptionPane.showMessageDialog(this, "Error al agregar profesor: " );
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
}

      
    

    
    

