/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Jimmy
 */
public class Paciente {
    public String ID;
    public String nombre;
    public String padecimiento;
    public String estado;
    //public  fechaIngreso;

    public Paciente(String ID, String nombre, String padecimiento, String estado){
        this.ID = ID;
        this.nombre = nombre;
        this.padecimiento = padecimiento;
        this.estado = estado;
    }
}
