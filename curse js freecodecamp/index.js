// ejercicio : ordenar un array de numeros

/*  2 3 4 1
    2 3 4 4
    2 3 3 4
    2 2 3 4
    1 2 3 4
*/ 


function resolver(arr){

    let bandera = false
    let n_array = arr.length
    let valor_ubicar = arr[n_array - 1]

    for(let i = n_array - 2 ; i >= 0; i--){
        if(valor_ubicar < arr[i]){
            arr[i+1] = arr[i]

        }else{
            arr[i+1]=valor_ubicar
            bandera = true
            break
        }
        printArray(arr)
    }
    if(bandera!=true){
        arr[0 = valor_ubicar]
    }
    printArray(arr)

}

function printArray(arr){
    console.table(arr)
}

resolver([2,3,4,1])