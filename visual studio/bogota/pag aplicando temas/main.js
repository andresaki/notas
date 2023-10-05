// ejercicio 1_ ______________________________________________________________________________________________

const txtNombre = document.getElementById("input_nombre")
const txtEdad = document.getElementById("input_edad")
const btncalcular = document.getElementById("button_ok")
const pResultado = document.getElementById("resultado_1")

btncalcular.addEventListener('click', calcular)

function calcular(){
    const nombre = txtNombre.value
    const edad = txtEdad.value
    if(edad < 18){
        pResultado.innerText = nombre +  " NO eres mayor de edad."
    }else{
        pResultado.innerText = nombre + " Eres mayor de edad"}
    }

// ejrcicio 2 ___________________________________________________________

const txttabla = document.getElementById("input_n_tabla")
const btncalcular2 = document.getElementById("button_ok2")
var pResultado2 = document.getElementById("resultado_2")

btncalcular2.addEventListener('click',calcular2)

function calcular2(){

    var tabla = txttabla.value
    var mostrar = "tabla del " + tabla + "<br/> <br/>"
    var mult = 0

    for(var i = 0; i<=10 ; i++){
        mult = tabla * i
        mostrar = mostrar +" - "+ tabla + " x " + i + " = " + mult + "<br/>"
    }

    pResultado2.innerHTML = mostrar
}
