package com.ciclo2.familia;

public class Familia {

    
    public static class Abuelo{
        
        private String nombre;
        private int edad;

        public Abuelo(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        
        
        @Override
        public String toString(){
            return "soy el abuelo y me llamo : " + nombre;
        }             
    }
    
    public static class Padre extends Abuelo{

        public Padre(String nombre, int edad) {
            super(nombre, edad);
        }
        
        @Override
        public String toString(){
            return "d";
        }
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
    }
}
