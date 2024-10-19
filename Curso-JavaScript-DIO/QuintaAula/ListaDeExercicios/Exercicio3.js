/*
    3- Faça um programa que calcule e imprima o salário a ser transferido para um funcionario.
    Para realizar o calculo receba o valor bruto do salário e o adicional dos benefícios 
    O salário a ser transferido é calculado da seguinte maneira:

    valor bruto do salário - percentual de impostos mediante a faixa salarial + adicional de beneficios

    Para calcular o percentual de impostos segue as aliquotas:

    de R$0,00 a R$1100,00 = 5.00%
    de R$1100,01 a R$2500,00 = 10.00%
    maior que R$2500,00 = 15.00%
*/


const { gets2, print} = require('./funcoes-Auxiliares1');

const salario = gets2();
const beneficios = gets2();

function calculoSalarioBruto(salario, beneficios){
    let salarioBruto = 0;
    if(salario > 0 && salario <= 1100 ){
        salarioBruto = (salario - (salario*0.05)) + beneficios;
        return salarioBruto;
    }else if(salario > 1101 && salario <= 2500){
        salarioBruto = (salario - (salario*0.1)) + beneficios;
        return salarioBruto;
    }else if( salario > 2500){
        salarioBruto = (salario - (salario*0.15)) + beneficios;
        return salarioBruto;
    }
}
print(calculoSalarioBruto(salario, beneficios));