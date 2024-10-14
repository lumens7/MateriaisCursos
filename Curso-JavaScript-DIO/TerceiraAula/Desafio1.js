/*
    1- Crie uma classe para representar carros.
    Os carros possuem uma marca, uma cor e um gasto medio de combustivel por KM rodado.
    Crie um método que dado a quantidade de quilometros e o preço do combustivel nos dê o valor
    gasto em reais para realizar este percurso.
*/
class Carro{
    marca;
    cor;
    gastoPKM;
    
    constructor(marca, cor, gastoPKM){
        this.marca = marca;
        this.cor = cor;
        this.gastoPKM = gastoPKM;
    }
    calcularGastoPKM(kmRodados, precoCombustivel){
        const gastoRealPKM = (kmRodados/this.gastoPKM) * precoCombustivel;
        return gastoRealPKM;
    };
}

const corola = new Carro('Corola', 'black', 20);
console.log(corola);
console.log(corola.calcularGastoPKM(500, 6.07));

/*
    2-Crie uma classe para representar pessoas.
    Para cada pessoa teremos os atributos nome, peso e altura.
    As pessoas devem ter a capacidade de dizer o valor do seu IMC = peso/ (altura * altura).
    Instancie uma pessoa chamada José que tenha 70kg de peso e 1.75 de altura, e peça ao José 
    para dizer o valor do seu IMC;
*/
class Pessoa{
    nome; 
    peso;
    altura;
    constructor(nome, peso, altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    classificarIMC(){
        const IMC = this.peso / (this.altura * this.altura);
        if(IMC < 18.5){
            return "abaixo do peso, imc igual a: "+ IMC;
        }else if(IMC >= 18.5 && IMC <= 25){
            return "peso normal, imc igual a: "+ IMC;
        }else if(IMC > 25 && IMC <= 30){
            return "acima do peso, imc igual a: "+ IMC;
        }else if(IMC >30 && IMC <= 40){
            return "obeso, imc igual a: "+ IMC;
        }else if(IMC > 40){
            return "Obesidade grave, imc igual a: "+ IMC;
        }
    }
}
const Jose = new Pessoa('José', 70, 1.75);
console.log(Jose);
console.log(Jose.classificarIMC());
