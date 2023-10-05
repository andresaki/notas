/*
// esto es una alerta (ventana pequeña de advertencia)
//alert(  "holllllaaa" );

// variable
var variable_1 = "holaaaa guapos";
var variable_2 = 12

// var para global
// let para funciones

console.log(variable_1)


//aqui no da error esta concatenando 
variable_1 = variable_1 + variable_2 
console.log(variable_1)

// aqui hace la suma de los enteros y luego concatena el string
variable_2 = variable_2 + 10 + "123"  
console.log(variable_2)*/


//lista
// var carros = ["bmw m4" , "nissan s13" , "nissan s240" , "nissan s14"]



// console.log( "primer carro: "+ carros[0])



// carros[2] = "ford f4 19980"      //cambia el valor
// delete carros [1]                //elimina el valor de esa posicion
// carros.push("lambo 1998")        //añade un valor en el aultima pocision
// carros.length                    //tamaño de la lista


//  ejercicio : invertir una palabra

var palabra_ingresada = "coderbyte"

var palabra_invertida = ""

for(var i = palabra_ingresada.length-1; i>=0 ; i--){
    palabra_invertida += palabra_ingresada[i]
}
console.log("palabra ingresada--> " + palabra_ingresada + "\npalabra invertida-->" + palabra_invertida)
