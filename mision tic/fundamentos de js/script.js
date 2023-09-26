// hacer una copia de un objeto

    // INCORRECTO

    const persona ={
        nombre: "carlos",
        edad: 25
    }

    const copia = persona
    persona.edad = 30;

    // el valor de edad va a hacer actualizado a los dos objetos


    //  CORRECTA    

    const copiaPersona = Object.assign({},persona)   // (donde se guarda,  de que se copia)
    // si uno actualiz un valor en un objeto especifico no se midfica el otro

/*------------------------------------------------------------------ */

// funcion normal antigua
function multiplicacion(n1,n2){
    let resultado = n1 * n2
    return resultado
}

// funcion flecha
const suma = (a,b) => a+b
    //solo se puede llamar despues no antes
console.log(suma(5,9))

