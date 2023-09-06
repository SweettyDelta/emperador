
package mx.itson.proyectoEmperador;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        System.out.println("Nombres de los alumnos: ");
        Scanner keys = new Scanner (System.in);
        String alumnos = keys.nextLine();
        
        String[] resultado = new Operacion().Organizar(alumnos);
        
        
       for(String s : resultado){
           
           String[] nombres = s.split(" ");
           
           String id = nombres[0];
           String nombre = nombres[1];
           String apellido = nombres[3];
           System.out.println("El id es: " +id+" "+ "Nombre: " + nombre + " " + apellido);
           
       }
        
        
        
    }
    
}
