/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.Ordenamiento;

import Entidades.ListaGlobalDetalles;
import java.util.Comparator;

/**
 *
 * @author Jimmy
 */
public class OrdenarIDSort implements Comparator<ListaGlobalDetalles>{
    
    //Descendente
    @Override
    public int compare(ListaGlobalDetalles paciente1, ListaGlobalDetalles paciente2) {
        return Integer.compare(paciente1.IDPaciente, paciente2.IDPaciente);
    }
}
