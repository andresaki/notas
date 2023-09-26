package com.ciclo2.estudiantes.controlador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controlador {

    public static int capturarOpcion() {

        int opcion = 0;  //la opcion es inicializada en 0 por lo tanto entra de una vez a while

        while (opcion < 1 || opcion > 6) {          // ya entro al ciclo

            System.out.println("Opcion : \n");      //muestra el mensaje para que indique que ingrese la opcion

            try {
                opcion = lector.input.nextInt();    //try: intenta que ingrese una opcion entero , si no es entero entra en el catch

            } catch (InputMismatchException exception) {    // cuando entre al catch:muestra un mensaje de error que es el inputmismatchException ,y vuelve le pide que ingrese un entero

                opcion = lector.input.nextInt();  //el exception le dice que omita el input en la variable opcion , 
            }

            // try-catch:  es para que no se rompa el programa, si no que intente una y otra vez
        }
        
        return opcion;

    }
}

class lector {

    static Scanner input = new Scanner(System.in);
}
