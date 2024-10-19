//estruturas de repetição
//for

const nome = "Lumens Felix";

for(let index = 0; index < nome.length; index++){
    console.log(nome[index]);
}

//--------------------------------------------

const notas = [];

notas.push(6);
notas.push(7);
notas.push(8);

let soma = 0;
for(let i = 0; i < notas.length; i++){
    const nota = notas[i];
    soma = soma + nota;
}
console.log(soma/notas.length);