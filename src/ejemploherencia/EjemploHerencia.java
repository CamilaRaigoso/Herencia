/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author Estudiante
 */
public class EjemploHerencia {

  
    public static void main(String[] args) {
     Profesor p = new Profesor("Javier","3132242313","Poo");
     double notas[] = {5,5,5,};
     Estudiante e = new Estudiante (notas, p, "w", "456", "poo");
        System.out.println(e.getDireccion());
        System.out.println(e.getMateria());
        System.out.println(e.getAsignado().getDireccion());
        System.out.println(e.calcularPromedio());
        
                 
     }
    }
    

