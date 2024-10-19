const entradas = [5, 5, 4, 3, 2, 1];
let i = 0;
const entradas2 = [1500, 300];

function gets(){
    const valor = entradas[i];
    i++;
    return valor ;
}
function gets2(){
    const valor = entradas2[i];
    i++;
    return valor ;
}

function print(texto){
    console.log(texto);
}



module.exports = {gets, print, gets2};
