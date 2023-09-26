//aqui dice que pertenece a un paquete y se llama..
package com.ciclo2.holamundo;

import java.util.Scanner;

public class HolaMundo {

    //main= principal , void= vacido-nada(no retorna nada)
    public static void main(String[] args) {
        String nombre; //declaracion nombre
        Scanner input = new Scanner(System.in);     //se llama el objeto scanner y se nombra input  
        System.out.println("Ingrese su nombre:");   //se imprime en terminal el mensaje
        nombre = input.nextLine();                       //la variable nombre se le introduce lo que le va a entrar en el input
        System.out.println("hola " + nombre);           // se imprime el mensaje final    
    }
}
