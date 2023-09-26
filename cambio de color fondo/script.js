function estilo() {

    var color = "#"  //color hexadecimal empieza con -#


    // se necesita 6 numeros para crear un numero hexadecimal
    for (let i = 0; i<6; i++){   
        let numero = parseInt(Math.random() * (10 - 0) + 0);  // nmero random de 0 a 9
        color = color + numero;
    }
    
    //cambia el color de fondo se pasa un string
    document.getElementById("body").style.backgroundColor=color

    // cambia el texto del h4 que tiene que color es , tembien se pasa un string
    document.getElementById("colorhex").innerText = color
    
}


