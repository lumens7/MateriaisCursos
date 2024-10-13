/*
    Faça um programa para calcular o valor de uma viagem.

    Você terá 5 variaveis. Sendo elas:
    1- Preço do etanol;
    2- Preço da gasolina;
    3- O tipo de combustível que está no seu carro;
    4- Gasto médio de combustível do carro por KM
    5- Distância em KM da viagem;
    Imprima no console o valor que será gasto para realizar está viagem
*/
const etanol = 4.04;
const gasolina = 6.07;
const gastoPorKM = 10;
const distancia = 500;
let combustivelMeuCarro = etanol;
if(combustivelMeuCarro === etanol){
    const valViagemEtanol = (distancia/gastoPorKM) * etanol;
    console.log("o valor total da viagem é de: "+ valViagemEtanol)
}else if(combustivelMeuCarro === gasolina){
    const valViagemgasolina = (distancia/gastoPorKM) * gasolina;
    console.log("o valor total da viagem é de: "+ valViagemgasolina)
}