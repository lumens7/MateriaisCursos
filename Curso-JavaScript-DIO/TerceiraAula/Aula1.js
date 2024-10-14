const lumens = {  //Objeto, é uma condição dinamica de chave e valor
    nome : 'Lumens Felix',
    idade : 19,
    descrever: function (){
        console.log(`Meu nome é ${this.nome} e minha idade é ${this.idade}`);
    }
};

lumens.descrever();
lumens.nome = 'Luis'
lumens.idade = 22

lumens.descrever = function(){
    console.log(`Meu nome é ${this.nome}`)
}
lumens.descrever();

const atributo = 'idade';
console.log(lumens[atributo]);

class Pessoa{
    nome;
    idade;
    anoDeNascimento;
    constructor(nome, idade){
        this.nome = nome;
        this.idade = idade;
        this.anoDeNascimento = 2024 - idade;
    }

    descrever(){
        console.log(`Meu nome é ${this.nome} e minha idade é ${this.idade} eu nasci no ano de ${this.anoDeNascimento}`);
    }
}

const lumen = new Pessoa("Lumens", 19);
lumen.descrever();

const luis = new Pessoa("Luis", 20);
luis.descrever();

function compararPessoa(p1, p2){
    if(p1.idade > p2.idade){
        console.log(`${p1.nome} é mais velho(a) que ${p2.nome}`);
    }else if(p1.idade < p2.idade){
        console.log(`${p1.nome} é mais novo(a) que ${p2.nome}`);
    }else{
        console.log(`${p1.nome} tem a mesma idade que ${p2.nome}`);
    }
}

const Fernando = new Pessoa('Fernando', 18);
const Marcos = new Pessoa('Marcos', 22);
compararPessoa(Fernando, Marcos);