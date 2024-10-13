//funções

function SayMyName(name){
    console.log('Your name is ' + name);
}
SayMyName('luis');

function quadrado(val){
    return val*val;
}
const quadradoDeNum = quadrado(10);
console.log(quadradoDeNum+ quadradoDeNum);

function incrementarJuros(valor, percentualJuros){
    const valorDeAcrecimo = (percentualJuros/100)*valor;
    return valor + valorDeAcrecimo; 
}

console.log(incrementarJuros(100, 10));
console.log(incrementarJuros(100, 25));


//organizar funções


function main(){
    console.log("programa principal");
}

main();