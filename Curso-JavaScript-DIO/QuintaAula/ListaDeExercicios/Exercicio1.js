/*
    1- Faça um programa que receba a média de um aluno.
    Caso a média seja < 5 imprima "Reprovado"
    Caso a média seja >= 5 e < 7 imprima "Recuperação"
    Caso a média seja >=7 imprima "Aprovado"

*/

const { gets, print} = require('./funcoes-Auxiliares1');

const entradas = gets();
let soma = 0;
for(let i = 0; i < entradas; i++){
    const nota = gets();
    soma = soma + nota;
}

print(soma/entradas);