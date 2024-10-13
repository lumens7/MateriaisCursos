/* Faça um programa para calcular o valor de uma viagem.

Você terá 3 variáveis. Sendo elas:
1- Preço do Combustível;
2- Gasto médio de combustível do carro por KM;
3- Distância em KM da viagem; 

*/ 

const precoCombustivel = 6.07;
const kmPorLitro = 10;
let distanciaEmKM = 100;

const calculoValViagem = (distanciaEmKM/kmPorLitro) * precoCombustivel;

console.log("O valor total da viagem é de : "+ calculoValViagem);