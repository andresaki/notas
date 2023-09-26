package com.ciclo2.estudiantes.modelo;

import com.ciclo2.estudiantes.controlador.Controlador;
import com.ciclo2.estudiantes.vista.Vista;
import java.util.ArrayList;

public class Modelo {

    public static ArrayList<String> nombres = new ArrayList<>();
    public static ArrayList<String> apellidos = new ArrayList<>();
    public static ArrayList<String> nacimiento = new ArrayList<>();
    public static ArrayList<String> correo = new ArrayList<>();
    public static ArrayList<String> celular = new ArrayList<>();
    public static ArrayList<String> programa = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            Vista.imprimirMenu();     //trae la opcion imprimirMenu
            int valor = Controlador.capturarOpcion();  //ejecuta el metodo de capturarOpcion y la guarda en la variable valor

            switch (valor) {  //para cada opcion tiene su metodo y mensaje
                case 1:
                    System.out.println("Ingresar Estudiante : ");
                    Controlador.ingresar();
                    break;
                case 2:
                    System.out.println("Buscar Estudiante : ");
                    Controlador.buscar();
                    break;
                case 3:
                    System.out.println("Modificar Estudiante : ");
                    Controlador.modificar();
                    break;
                case 4:
                    System.out.println("Eliminar Estudiante : ");
                    Controlador.eliminar();
                    break;
                case 5:
                    System.out.println("Ver listado de estudiante : ");
                    Controlador.verDirectorio();
                    break;
                case 6:
                    System.out.println("Salir : ");
                    System.exit(0);
                    break;
            }
        }
    }
}
