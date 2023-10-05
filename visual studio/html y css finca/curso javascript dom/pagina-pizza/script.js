// seleccionar un elemento por su ID

const contenedor = document.getElementById('contenedor');

console.log(contenedor)  // nos da las propiedades del 'contenedor'   , en caso de que otro elemento tenga el mismo id getelementbyid escoje el primero
console.log(contenedor.innerHTML) // no das la estructura del contenida del contenedor en html 
console.log(contenedor.innerText) // no das el texto 
console.log(typeof contenedor) // retorna que es de un tipo object
console.log(contenedor.tagName) // que etiqueta es ?  nos da div



// seleccionar elementos por su CLASE

const toppins = document.getElementsByClassName('topping');

console.log(toppins) //devuelve una collecion
console.log(toppins.length)   // devulve la cantidad de elementos que tiene esa clase

console.log(toppins[0]) //devuelve el elemento 'aceitunas'
console.log(toppins[0].id) // se puede acceder al id del elemento


// seleccionar o buscar generalmente un elemento 

const elementos = document.getElementsByTagName('li')
console.log(elementos)


// -------------------------------------------------------------------


// seleccionar un elemento que cumple un criterio de css

/* dos metodos
 .querySelector()         =  seleciona el primer elemento que cumpla ese criterio    (id, class, .... )
 .querySelectorAll()      =  seleciona todos los elementos que cumpla ese criterio   

*/


