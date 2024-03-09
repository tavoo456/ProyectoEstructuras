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
public class GestorDoctores {
    private ArrayList<Doctor> listadoDoctores = new ArrayList<>();
    
    public GestorDoctores(){
        
    }
    
    public void agregarDoctores(int ID, String nombre, String especialidad){
        Doctor doctor = new Doctor(ID, nombre, especialidad);
        listadoDoctores.add(doctor);              
    }
    
    public ArrayList<Doctor> obtenerListaDoctores(){
        return listadoDoctores;
    }
}
