/*
    2- Faça um programa que receba N (quantidade de números) e seus respectivos valores
    imprima a maior número par e o menor número impar.
*/

const { gets, print} = require('./funcoes-Auxiliares1');

const entradas = gets();

let maiorPar = null;
let menorImpar = null;
for(let i = 0; i < entradas; i++){
    let num = gets();
    if(num%2 === 0){
        if(maiorPar ===  null || num > maiorPar){
            maiorPar = num;
        }
    }else if(num % 2 === 1){
        if(menorImpar === null || num < menorImpar){
            menorImpar = num;
        }
    }
}

print(maiorPar);
print(menorImpar);