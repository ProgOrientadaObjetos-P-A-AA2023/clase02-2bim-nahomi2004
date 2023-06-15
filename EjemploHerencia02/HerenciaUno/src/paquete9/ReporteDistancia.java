/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDistancia extends Reporte{
    
    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;
    
    public ReporteDistancia(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
        
    }
    
    public void establecerLista(ArrayList<EstudianteDistancia> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasDistancia(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia + 
                    lista.get(i).obtenerMatriculaDistancia();
        }
    }
    
    public ArrayList<EstudianteDistancia> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaDistancia;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Carrera: %s \n"
                + "Ciclo: %s\n",
                carrera,
                ciclo);
        
        for (int i=0; i<obtenerLista().size();i++) {
            cadena = String.format("%s\nNombre: %s\n"
                    + "Apellido: %s\n"
                    + "Identificacion: %s\n"
                    + "Edad: %d\n"
                    + "Costo asigantura: %.2f\n"
                    + "Numero asignaturas: %d\n"
                    + "Total matricula: %.2f\n",
                    cadena,
                    obtenerLista().get(i).nombresEstudiante,
                    obtenerLista().get(i).apellidosEstudiante,
                    obtenerLista().get(i).identificacionEstudiante,
                    obtenerLista().get(i).edadEstudiante,
                    obtenerLista().get(i).costoAsignatura,
                    obtenerLista().get(i).numeroAsignaturas,
                    obtenerLista().get(i).matriculaDistancia);
        }
        
        cadena = String.format("%s\nEl total de matriculas es: %.2f\n",
                cadena,
                obtenerTotalMatriculasDistancia());
        return cadena;
    }
    
}
