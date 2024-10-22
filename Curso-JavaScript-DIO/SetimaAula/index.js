function Pessoa(nome, idade){
    this.nome = nome;
    this.idade = idade;
}

Pessoa.prototype.falar = function(){
    console.log(`meu nome é: ${this.nome}` )
}

class Pessoa{
    constructor(nome, idade){
        this.nome = nome;
        this.idade = idade;
    }
    falar(){
        console.log(`meu nome é: ${this.nome}` )
    }
}

//------------------------------

String.prototype.toPLang = function(){
    return `P ${this}`
}
console.log('teste'.toPLang())