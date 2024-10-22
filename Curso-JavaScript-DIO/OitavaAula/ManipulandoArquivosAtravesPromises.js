//Manipulando Arquivos através de Promises

const fs = require('fs');
const path = require('path');
const filepath = path.resolve(__dirname, 'tarefas.csv');

const leituraDeArquivo = fs.promises.readFile(filepath);

leituraDeArquivo
    .then((arquivo) => arquivo.toString('utf-8'))
    .then((textoDoArquivo) => textoDoArquivo.split('\n').slice(1)) 
    .then((linhas) => linhas.map((linha) => {  
        const [nome, feito] = linha.split(';');
        return {
            nome, 
            feito: feito.trim() === 'true'
        };
    }))
    .then((listaDeTarefas) => console.log(listaDeTarefas))
    .catch((error) => console.log('Deu ruim!', error));
