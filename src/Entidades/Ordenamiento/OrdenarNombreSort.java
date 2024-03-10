/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.Ordenamiento;

/**
 *
 * @author Jimmy
 */
import Entidades.ListaGlobalDetalles;
import java.util.Comparator;

public class OrdenarNombreSort implements Comparator<ListaGlobalDetalles>{
    
    @Override
    public int compare(ListaGlobalDetalles paciente1, ListaGlobalDetalles paciente2) {
        return paciente1.nombrePaciente.compareTo(paciente2.nombrePaciente);
    }
}
