/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import java.util.ArrayList;
/**
 *
 * @author Jimmy
 */
public class Doctor {
    public int ID;
    public String nombre;
    public String especialidad;
    public ArrayList<Paciente> listaPacientes;
    
    //Contructor vacío
    public Doctor(){
        
    }
    
    public Doctor(int ID, String nombre, String especialidad){
        this.ID = ID;
        this.nombre = nombre;
        this.especialidad = especialidad;
        listaPacientes = new ArrayList<>();
    }

}
