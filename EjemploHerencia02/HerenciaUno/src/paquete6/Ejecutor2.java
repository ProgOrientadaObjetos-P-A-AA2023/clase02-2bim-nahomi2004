/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos
        
        // Trabajo clases 15 junio 2022
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";
        
        System.out.println("Ingrese estudiante/s");
        
        while(bandera){
            System.out.println("Ingrese nombre:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese apellido:");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese id:");
            String id = entrada.nextLine();
            System.out.println("Ingrese edad:");
            int edad = entrada.nextInt();
            System.out.println("Ingrese numero de creditos:");
            int credit = entrada.nextInt();
            System.out.println("Ingrese costo de los credito:");
            double costo = entrada.nextInt();
            
            EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, id, edad, costo, credit);
            
            estPresencial.calcularMatriculaPresencial();
            
            cadena = String.format("\n%s\n%s\n",cadena, estPresencial);
            
            entrada.nextLine();
            System.out.println("Desea salir, pulse Si");
            String opcion = entrada.nextLine();
            if(opcion.equals("Si")){
                bandera = false;
            }
        }
        
        System.out.println("ESTUDIANTE/S:");
        System.out.printf("%s\n", cadena);
    }
}




