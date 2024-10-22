//first Class Functions
//higher order Functions

function falarMeuNome (){
    console.log("meu nome é luis")
}
function falarMeuSobrenome(){
    falarMeuSobrenome()
    console.log("Felix")
    return falarMeuNome
} 
falarMeuSobrenome(falarMeuNome())
//----------------


function NomeDaFuncao(){
    console.log("NomeDaFuncao")
}
let nomedaOutraFuncao;
nomedaOutraFuncao = function(){
    console.log("nomedaOutraFuncao")

}
NomeDaFuncao()
nomedaOutraFuncao()

//------------------

function funcao1(){
    console.log(this)
}

const funcao2=() => {
    console.log(this)
    
}
const luis = {
    nome: luis,
    funcao1, 
    funcao2
}
luis.funcao1()
luis.funcao2()

//------------------

function soma(x) {
    return (y)=>{
        return x+y;
    }
}
console.log(soma(10)(20))
const somaParcial = soma(10)

console.log(somaParcial(20))
console.log(somaParcial(30))
console.log(somaParcial(40))

//---------------------

const pessoa = {
    nome: "lumens",
    idade:19
}

function gritar(prefixo){
    console.log(prefixo, this.nome)
}

gritar("Olaaaaaaaaaaaa")

gritar.apply(pessoa, ["Olaaaaaaa"])
gritar.call(pessoa, "Olaaaaaaaa")

//---------------------
function adicao(x, y) {
    return x+y
}
function multiplicacao(x, y) {
    return x*y;
}

function calculadora(x, operacao, y){
    console.log(operacao(x, y))
}
calculadora(10, adicao, 20);
calculadora(10, multiplicacao, 20);

document.getElementById('btn1').addEventListener('click', ()=>{
    console.log("clicou!")
})
