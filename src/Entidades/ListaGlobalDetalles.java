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
public class ListaGlobalDetalles {
    public int IDPaciente;
    public String nombrePaciente;
    public String padecimiento;
    public String estado;
    public Date fechaIngreso;
    public String nombreDoctor;
    
    public ListaGlobalDetalles(int IDPaciente, String nombrePaciente, String padecimiento, String estado, String fechaIngreso, String nombreDoctor) throws ParseException{
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        this.fechaIngreso = new Date();
        
        this.IDPaciente = IDPaciente;
        this.nombrePaciente = nombrePaciente;
        this.padecimiento = padecimiento;
        this.estado = estado;
        this.fechaIngreso = formatoFecha.parse(fechaIngreso);
        this.nombreDoctor = nombreDoctor;
    }
}
