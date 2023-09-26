/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ciclo2.reto1_java;

/**
 *
 * @author USUARIO
 */
public class Reto1_java {

    
    public static int[] reporte(int [] compra){
        
        //variables
        int costoTotal = 0;
        int costoMenor = compra[0] ;
        int costoMayor = compra[0];
        
        
        for (int i = 0; i < compra.length; i++) {
            
            if (compra[i] > costoMayor) {
                costoMayor = compra[i];
            }
            
            if (compra[i] < costoMenor) {
                costoMenor = compra[i];
            }
            
            costoTotal = costoTotal + compra[i];
        }
        
        int[] respuesta = {costoTotal , costoMenor , costoMayor};
 
        
        return respuesta;
    }
    
    
    public static void main(String[] args) {
        
        int [] compra1 = {2700,9500,300,15000,1800,10000,400,3000,400};
        int [] respuesta = reporte(compra1);
        
        for (int i = 0; i < compra1.length; i++) {
            System.out.println(respuesta[i]);
        }
    }
}
