/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Profesor extends Persona{
    private String cedula;
    private String area;
    private double valorHora;
    private int horasMes;
    
    public Profesor() {
    }
    
    public String getCedula(){
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getArea() {
        return area;
    }
    public void setArea (String area) {
        this.area = area;
        
    }
     public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
            this.valorHora = valorHora;
        }    
        public int getHoraMes(){
            return horasMes;
        }
        public void setHorasMes(int horasMes) {
            this.horasMes = horasMes;
        }
        public double calcularPagoMensual(){
            double base = valorHora * horasMes;
            return base + (base * 0.30);
        }
        public double CalcularPagoMensual (int horas, double valorHoras){
            double base = horas * valorHora;
            return base + (base * 0.30);
        }
        
        
        
}

