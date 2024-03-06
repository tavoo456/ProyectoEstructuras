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
    public ArrayList<String> listaEstado;
    public ArrayList<String> listaFechas;
    
    public BancoDeDatos(){
        listaNombres = new ArrayList<>();
        listaPadecimientos = new ArrayList<>();
        listaEspecialidades = new ArrayList<>();  
        listaEstado = new ArrayList();
        listaFechas = new ArrayList<>();
           
        listaNombres.add("Juan Carlos Pereira Martinez");
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
        
        listaFechas.add("12/02/2024");
        listaFechas.add("13/02/2024");
        listaFechas.add("14/02/2024");
        listaFechas.add("15/02/2024");
        listaFechas.add("16/02/2024");
        listaFechas.add("17/02/2024");
        listaFechas.add("18/02/2024");
        listaFechas.add("19/02/2024");
        listaFechas.add("20/02/2024");
        listaFechas.add("21/02/2024");
        listaFechas.add("22/02/2024");
        listaFechas.add("23/02/2024");
        listaFechas.add("24/02/2024");
        listaFechas.add("25/02/2024");
        listaFechas.add("26/02/2024");
        listaFechas.add("27/02/2024");
        listaFechas.add("28/02/2024");
        listaFechas.add("29/02/2024");
        listaFechas.add("01/03/2024");
        listaFechas.add("02/03/2024");
        listaFechas.add("03/03/2024");
        listaFechas.add("04/03/2024");
        listaFechas.add("05/03/2024");
        listaFechas.add("06/03/2024");
        
        listaEstado.add("Leve");
        listaEstado.add("Moderado");
        listaEstado.add("Grave");
    }
    
    public String Seleccionar(int n){
        int num;

        switch (n){
            case 0:
                num = (int)(Math.random()*25);
                return listaNombres.get(num);
            case 1:
                num = (int)(Math.random()*20);
                return listaPadecimientos.get(num);
                
            case 2:
                num = (int)(Math.random()*10);
                return listaEspecialidades.get(num);
                
            case 3:
                num = (int)(Math.random()*3);
                return listaEstado.get(num);
            case 4:
                num = (int)(Math.random()*12);
                return listaFechas.get(num);
            default:
                return null;      
        }  
    }
}
