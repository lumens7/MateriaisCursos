//Arrays

const alunos = ['Lumens', 'Felix', 'Luffy'];

console.log(alunos);
console.log(alunos[0]);

alunos.push('Carlos');  //o push adiciona elementos ao Array

alunos[4] = 'Fernando'; //outra forma de adicionar elementos a um Array, adiciona passando a posição
console.log(alunos);

console.log(alunos.pop());  //remove o ultimo elemento do Array

console.log(alunos.shift());  //remove o primeiro elemento do Array

//----------------------------------------

const notas = [];

notas.push(5);
notas.push(7);
notas.push(8);
notas.push(2);
notas.push(5);

console.log(notas.length);  //metodo para saber o tamanho de um array

const media = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]) / notas.length;
console.log(media);