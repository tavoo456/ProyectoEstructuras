/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jimmy
 */
public class Paciente {
    public String ID;
    public String nombre;
    public String padecimiento;
    public String estado;
    public Date fechaIngreso;

    public Paciente(String ID, String nombre, String padecimiento, String estado, String fechaIngreso) throws ParseException{
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        this.fechaIngreso = new Date();
        
        this.ID = ID;
        this.nombre = nombre;
        this.padecimiento = padecimiento;
        this.estado = estado;        
        this.fechaIngreso = formatoFecha.parse(fechaIngreso);
    }
}
