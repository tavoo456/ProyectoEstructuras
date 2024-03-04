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
public class BancoDeDatos {
    
    public ArrayList<String> listaNombres;    
    public ArrayList<String> listaPadecimientos;    
    public ArrayList<String> listaEspecialidades;   
    
    public BancoDeDatos(){
        listaNombres = new ArrayList<>();
        listaPadecimientos = new ArrayList<>();
        listaEspecialidades = new ArrayList<>();  
        
        
        listaNombres.add("");
        listaNombres.add("Juan Carlos Martinez Lopez");
        listaNombres.add("Valentina Fernanda Perez Ramirez");
        listaNombres.add("Pedro Luis Sanchez Garcia");
        listaNombres.add("Camila Andrea Torres Diaz");
        listaNombres.add("Alejandro Javier Fernandez Cruz");
        listaNombres.add("Isabella Sofia Ramirez Alvarez");
        listaNombres.add("Mateo Alejandro Gonzalez Reyes");
        listaNombres.add("Lucia Gabriela Suarez Morales");
        listaNombres.add("Daniel Antonio Castro Herrera");
        listaNombres.add("Valeria Alejandra Diaz Silva");
        listaNombres.add("Nicolas Federico Ortiz Leon");
        listaNombres.add("Andrea Camila Vargas Aguilar");
        listaNombres.add("Diego Esteban Castro Bravo");
        listaNombres.add("Natalia Daniela Soto Flores");
        listaNombres.add("Julian Andres Guerrero Marin");
        listaNombres.add("Laura Valentina Mendez Rojas");
        listaNombres.add("Gabriel Eduardo Paredes Chavez");
        listaNombres.add("Ana Paula Rios Ortiz");
        listaNombres.add("Tomas Ignacio Mendez Jimenez");
        listaNombres.add("Sara Victoria Miranda Castro");
        listaNombres.add("Rafael Santiago Pineda Rivera");
        listaNombres.add("Carolina Elena Mora Lopez");
        listaNombres.add("Juan Pablo Salazar Medina");
        listaNombres.add("Mariana Isabel Rojas Cruz");
        listaNombres.add("Lucas Antonio Torres Soto");
        listaNombres.add("Antonella Valeria Guzman Gonzalez");
        listaNombres.add("Manuel Alejandro Reyes Torres");
        listaNombres.add("Valentina Gabriela Herrera Mendez");
        listaNombres.add("Juan Jose Velasco Aguilar");
        listaNombres.add("Daniela Sofia Cabrera Romero");
        listaNombres.add("Tomas Felipe Munoz Alvarez");
        listaNombres.add("Isidora Antonia Flores Martinez");
        listaNombres.add("Bruno Sebastian Castro Munoz");
        listaNombres.add("Renata Carolina Velazquez Guerrero");
        listaNombres.add("Martin Alonso Zamora Perez");
        listaNombres.add("Camila Fernanda Serrano Guerra");
        listaNombres.add("Ignacio Eduardo Ramirez Soto");
        listaNombres.add("Catalina Paz Mendoza Rivera");
        listaNombres.add("Diego Alejandro Espinoza Rojas");
        listaNombres.add("Antonia Francisca Bravo Molina");
        listaNombres.add("Joaquin Andres Pizarro Silva");
        listaNombres.add("Fernanda Paz Vargas Molina");
        listaNombres.add("Matias Ignacio Rojas Bravo");
        listaNombres.add("Sofía Emilia Paredes Ramos");
        listaNombres.add("Javier Alonso Orellana Aguilar");
        listaNombres.add("Javiera Constanza Fuentes Campos");
        listaNombres.add("Facundo Nicolas Salas Rojas");
        listaNombres.add("Antonella Maria Gutierrez Ortiz");
        listaNombres.add("Maximiliano Jose Castro Velasco");
        listaNombres.add("Sofia Maria Rodriguez Gomez");
        
        listaPadecimientos.add("");
        listaPadecimientos.add("Gripe");
        listaPadecimientos.add("Infecciones de la piel");
        listaPadecimientos.add("Dolor de cabeza");
        listaPadecimientos.add("Dolor de garganta");
        listaPadecimientos.add("Infecciones del tracto urinario");
        listaPadecimientos.add("Alergias");
        listaPadecimientos.add("Conjuntivitis");
        listaPadecimientos.add("Estreñimiento");
        listaPadecimientos.add("Diarrea");
        listaPadecimientos.add("Gastritis");
        listaPadecimientos.add("Reflujo gastroesofágico");
        listaPadecimientos.add("Hipertensión arterial");
        listaPadecimientos.add("Diabetes tipo 2");
        listaPadecimientos.add("Ansiedad");
        listaPadecimientos.add("Depresión");
        listaPadecimientos.add("Insomnio");
        listaPadecimientos.add("Dolores musculares y articulares");
        listaPadecimientos.add("Quemaduras leves");
        listaPadecimientos.add("Picaduras de insectos");
        listaPadecimientos.add("Resfriado común");
        
        listaEspecialidades.add("");
        listaEspecialidades.add("Medicina Familiar");
        listaEspecialidades.add("Medicina General");
        listaEspecialidades.add("Pediatría");
        listaEspecialidades.add("Medicina del Dolor");
        listaEspecialidades.add("Medicina Física y Rehabilitación");
        listaEspecialidades.add("Rehabilitación");
        listaEspecialidades.add("Medicina Preventiva");
        listaEspecialidades.add("Medicina del Deporte");
        listaEspecialidades.add("Gastroenterología");
        listaEspecialidades.add("Medicina Interna");
    }
    
    public String SeleccionarNombre(){
        int num;
        
        num = (int) Math.round(Math.random()*25);
        
        return listaNombres.get(num);
    }
    
    public String SeleccionarPadecimiento(){
        int num;
        
        num = (int) Math.round(Math.random()*10);
        
        return listaPadecimientos.get(num);
    }
    
    public String SeleccionarEspecialidad(){
        int num;
        
        num = (int) Math.round(Math.random()*5);
        
        return listaEspecialidades.get(num);
    }
}
