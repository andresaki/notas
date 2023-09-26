package com.ciclo2.empleados;

public class Empleados {

    public static class empleado {  //creacionde un clase

        private String nombre; //private solo pertenece a esa clase , no se puede acceder a ese dato

        //constructor : permite crear nuevos objetos(tiene que tener el mismo nombre de la clase)
        public empleado(String nombre) {
            this.nombre = nombre;  // this: este, .atributo:  atributo en si, = valor: esto quiere decir que al atributo nombre se le asigna el valor de entrada llamada nombre
            System.out.println("se construyo correctamente el empleado: " + nombre);
        }

        // GET : retorna valor obtiene el valor o devuelve el valor.    SET : restablecer, actualiza
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
            System.out.println("se cambio el nombre del empleado a : " + nombre);
        }

        @Override // permite sobrescribir un atributo
        public String toString() {
            return "El empleado se llama " + nombre;
        }
    }
    
    
    
    //clase operario  Derivada de clase empleado (clase heredada clase hija)
    //trae todos los atributos de la clase superior
    
    public static class Operario extends empleado {    

        public Operario(String nombre) {
            super(nombre);  // llama al atributo que esta en la clase superior. cuando se utilize el constructo de operario, se manda nombre y se guarda en la clase superior
            System.out.println("Operario/empleado construido");
        }
        
        @Override /// esto sobreescribe al metodo de la clase superior
        public String toString(){
            return super.toString() + " y es un operario.";  //convoca o llama al metodo toString del la clase superior
        }
        
        
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) { //metodo principal
 
        Operario OP1 = new Operario("laura");
        
        System.out.println(OP1.getNombre());   //metodo de la super clase
        System.out.println(OP1.toString());    //metodo propio por el @override
        
        
        System.out.println("-----------------------------------------");
        
        empleado emp1 = new empleado("daniel");
        Operario op1 = new Operario("andres");
        
        System.out.println(emp1);   //se emprime el toString
        System.out.println(op1);    //se emprime el toString propio
        
    }
}
