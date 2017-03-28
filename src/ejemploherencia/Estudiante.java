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
public class Estudiante extends Persona {
    private double[] notas;
    private Profesor asignado;
    
    public Estudiante (double [] notas, Profesor asignado, String direccion, String telefono, String materia){
        super (direccion, telefono, materia);
        
    }

    public double[] getNotas() {
        return notas;
    }

    public Profesor getAsignado() {
        return asignado;
    }
    
    public double calcularPromedio (){
        double resultado =0;
        for (double nota : notas){
            resultado+= nota; 
        }
        return resultado/notas.length;
    }
}
