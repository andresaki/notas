package com.ciclo2.reto1;

import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("¡Bienvenido! En esta aplicacion los estudiantes podran gestionar las notas de su materia.");

        System.out.println("Ingrese su nombre:");
        String nombre = input.nextLine();

        System.out.println("Ingrese su materia:");
        String materia = input.nextLine();

        //variables
        double nota;
        double porcentaje;
        double calculoNota;
        double porcentajeAcumulada = 0;
        double notaAcumulada = 0;
        String estado;

        while (true) {

            System.out.println("Ingrese la nota obtenida:");
            nota = input.nextDouble();

            System.out.println("Ingrese el porcentaje de la nota:");
            porcentaje = input.nextDouble();

            calculoNota = (porcentaje / 100) * nota;
            notaAcumulada = notaAcumulada + calculoNota;
            porcentajeAcumulada = porcentajeAcumulada + porcentaje;

            if (porcentajeAcumulada > 100) {
                System.out.println("El porcentaje evaluado de una materia no puede ser mayor a 100");
                porcentajeAcumulada = porcentajeAcumulada - porcentaje;
                notaAcumulada = notaAcumulada - calculoNota;
            } else if (porcentajeAcumulada < 100) {
                System.out.println("¿falta añadir notas? si= 1 / n= 0");
                int res = input.nextInt();

                if (res == 0) {

                    if (notaAcumulada >= 3) {
                        estado = "aprobado";
                    } else {
                        estado = "reprobado";
                    }
                    System.out.println("El estudiante " + nombre + " curso la materia " + materia + " y obtuvo " + notaAcumulada + " resultando en " + estado);
                    break;
                }
            } else {

                if (notaAcumulada >= 3) {
                    estado = "aprobado";
                } else {
                    estado = "reprobado";
                }

                System.out.println("El estudiante " + nombre + " curso la materia " + materia + " y obtuvo " + notaAcumulada + " resultando en " + estado);
                break;
            }
        }
    }
}
