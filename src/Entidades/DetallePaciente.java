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
public class DetallePaciente {
    private ArrayList<Doctor> listaDoctores;
    private ArrayList<String> listaDetallesGlobal;
    
    public DetallePaciente(){
        listaDoctores = new ArrayList<>();
    }
    
    public int CantidadPacientes(){
        int cantidadPacientes = listaDoctores.size();
        
        return cantidadPacientes;
    }
    
    public void LlenarListaDetallesGlobal(){
        int indiceDoctor = listaDoctores.size();
        
        for(int i = 0; i< indiceDoctor; i++){
            for(int j = 0; j<listaDoctores.get(i).GetListaPacientes().size(); j++){
                
            }
        }
    }
    
}
