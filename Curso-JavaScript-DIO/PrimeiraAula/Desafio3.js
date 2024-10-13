/*
1) Faça um algoritimo que dado as 3 notas tiradas por um aluno em um semestre da faculdade
calcule e imprima a media e a sua classificação conforme a tabela abaixo

media é igual a somatoria das notas tiradas em cada prova dividido pela quantidade de provas feitas

Classificação:

- media menos que 5, reprovação;
- media entre 5 e 7, recuperação;
- media acima de 7, passou de semestre;

*/

let nota1 = 10;
let nota2 = 5;
let nota3 = 2.5;
const media = (nota1+ nota2 + nota3)/3;
if(media<5){
    console.log("reprovado, media das notas : "+ media);
}else if(media >= 5 && media <= 7){
    console.log("recuperação, media das notas : "+ media);
}else if(media > 7){
    console.log("aprovado, media das notas : "+ media);
}

console.log("===============");

/*
2) O IMC - Indice de Massa Corporal é um criterio da Organização Mundial da Saúde para dar
uma indicação sobre a condição de peso de uma pessoa adulta.

Formula do IMC:
IMC = peso / (altura * altura)

Elabore um algoritimo que dado o peso e a altura de um adulto mostre sua condição de acordo com a tabela abaixo

IMC em adultos Condição:
- Abaixo de 18.5 Abaixo do peso;
- Entre 18.5 e 25 Peso normal;
- Entre 25 e 30 Acima do peso;
- Entre 30 e 40 Obeso;
- Acima de 40 Obesidade Grave;
*/


let peso = 57.5;
let altura = 1.78
const imc = peso / (altura* altura);

if(imc < 18.5){
    console.log("abaixo do peso, imc igual a: "+ imc);
}else if(imc >= 18.5 && imc <= 25){
    console.log("peso normal, imc igual a: "+ imc);
}else if(imc > 25 && imc <= 30){
    console.log("acima do peso, imc igual a: "+ imc);
}else if(imc >30 && imc <= 40){
    console.log("obeso, imc igual a: "+ imc);
}else if(imc > 40){
    console.log("Obesidade grave, imc igual a: "+ imc);
}

/*
3) Elabore um algoritimo que calcule o que deve ser pago por um produto, considere o preço normal de etiqueta
e a escolha da condição de pagamento.
Utilize os codigos da tabela a seguir para ler qual a consição de pagamento escolhida e efetuar o cálculo adequado

Código Condição de pagamento:
- À vista Débito, recebe 10% de desconto;
- À vista no Dinheiro ou Pix, recebe 15% de desconto;
- Em duas vezes, preço normal de etiqueta sem juros;
- Acima de Duas vezes, preço normal de etiqueta mais juros de 10%; 
*/

const produto = 100;
const condicaoPGTO = "credito";
const parcelas = 5;
if(condicaoPGTO == "debito"){
    const pgtoDeb = produto - ((produto*10)/100);
    console.log("O valor a ser pago pelo produto é de R$" + pgtoDeb);
}else if(condicaoPGTO == "pix" || condicaoPGTO == "dinheiro"){
    const pgtoAvista = produto - ((produto*15)/100);
    console.log("O valor a ser pago pelo produto é de R$" + pgtoAvista);
}else if( condicaoPGTO == "credito"){
    if(parcelas <= 2){
        console.log("O valor a ser pago pelo produto é de R$" + produto);
    }else if( parcelas> 2){
        const pgtoCredito = produto + ((produto*10)/100);
        console.log("O valor a ser pago pelo produto é de R$" + pgtoCredito);
    }
}