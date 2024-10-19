//2)Crie um programa que seja capaz de percorrer uma lista de números e imprima cada número par encontrado

const numeros = [];

numeros.push(3);
numeros.push(5);
numeros.push(6);
numeros.push(2);
numeros.push(10);
numeros.push(7);

let numero = 0;
for(let i = 0; i < numeros.length; i++){
    numero = numeros[i];
    if(numero % 2 == 0){
        console.log("numero par encontrado :"+ numero);
    }
}