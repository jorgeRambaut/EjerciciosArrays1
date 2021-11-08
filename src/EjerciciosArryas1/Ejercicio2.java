/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArryas1;

/**
 *
 * @author jorge
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        double [] inflacion ={0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9};
        String [] meses={"Enero","Febreor","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        double inflacionAnual=0;
        double inflacionMasBaja=inflacion[0];
        double inflacionMasAlta=0;
        int cantidadDeMeses=inflacion.length;
        String mesInflacionBaja="";
        String mesInflacionAlta="";
        double promedio=0;
        for (int i = 0; i < inflacion.length; i++) {
            inflacionAnual+=inflacion[i];
            if (inflacion[i] <=inflacionMasBaja) {
                inflacionMasBaja=inflacion[i];
                mesInflacionBaja=meses[i];
                
            }
            if (inflacion[i]>=inflacionMasAlta) {                
                inflacionMasAlta=inflacion[i];
                mesInflacionAlta=meses[i];
                
                
            }
        }
        promedio=inflacionAnual/cantidadDeMeses;
        System.out.println("Inflacion Anual " + inflacionAnual);
        System.out.print(mesInflacionBaja);
        System.out.println(" Inflacion Mas Baja "+ inflacionMasBaja);
        System.out.print(mesInflacionAlta);
        System.out.println(" Inflacion Mas Alta " + inflacionMasAlta);
        System.out.println("Promedio "+promedio);
    } 
    
}
