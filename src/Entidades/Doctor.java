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
    private String ID;
    private String nombre;
    private String especialidad;
    private ArrayList<Paciente> listaPacientes;
    
    //Contructor vacío
    public Doctor(){
        
    }
    
    public Doctor(String ID, String nombre, String especialidad){
        this.ID = ID;
        this.nombre = nombre;
        this.especialidad = especialidad;
        listaPacientes = new ArrayList<>();
    }
    
    //Getter y setters    
    public String GetID(){
        return ID;
    }
    
    public void SetID(String ID){
        this.ID = ID;
    }
    
    public String GetNombre(){
        return nombre;
    }
    
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public String GetEspecialidad() {
        return especialidad;
    }
    
    public void SetEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Paciente> GetListaPacientes() {
        return listaPacientes;
    }

    public void SetListaPacientes(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }
      
}
