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
    private String ID;
    private String nombre;
    private String padecimiento;
    private String estado;
    //private  fechaIngreso;

    public Paciente(){
        ID = "";
        nombre = "";
        padecimiento = "";
        estado = "";
    }
    
    public Paciente(String ID, String nombre, String padecimiento, String estado){
        this.ID = ID;
        this.nombre = nombre;
        this.padecimiento = padecimiento;
        this.estado = estado;
    }

    public String GetID() {
        return ID;
    }

    public void SetID(String ID) {
        this.ID = ID;
    }

    public String GetNombre() {
        return nombre;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String GetPadecimiento() {
        return padecimiento;
    }

    public void SetPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public String GetEstado() {
        return estado;
    }

    public void SetEstado(String estado) {
        this.estado = estado;
    }   
}
