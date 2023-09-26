// operador ternario

let helado = 'chocolate'

helado ==='chocolate' ? console.log('si') : console.log('no')

// switch

switch(3){
    case 2:
        console.log("no es 3")
        break;

    case 3: 
        console.log('si es 3')
        break;
    default:
        console.log('ninguno')
        break;

}

// recorrer un arreglo

let array = ['A', 'B', 'C']
array.forEach((Element) => {console.log(Element)})

array.forEach((Element,index) => {console.log(Element,' esta en el indice ' , index)})