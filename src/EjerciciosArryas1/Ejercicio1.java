/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArryas1;

/**
 *
 * @author jorge
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int total=0;
        int mayor=0;
        int contador=0;
        int [] vector = {10,20,5,15,30,20};
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Indice:" + i+ " Valor "+ vector[i] );
                      
            total+=vector[i];
            if (i%2==1) {
                System.out.println("Posicion " + i + " Valor "+vector[i]);
            }
             if (vector[i]>mayor) {
                mayor=vector[i];
                
            }
             if (vector[i]== 20) {
                contador++;
                
            }
        }
        System.out.println("Total es " + total);
        System.out.println("El Mayor es " + mayor);
        System.out.println("El Numero 20 aparecio : "+contador);
        
        
        
        
    }
    
}
