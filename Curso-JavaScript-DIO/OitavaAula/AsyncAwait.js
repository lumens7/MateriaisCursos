//Async e Await

const fs = require('fs');
const path = require('path');
const filepath = path.resolve(__dirname, 'tarefas.csv');

const leituraDeArquivo = fs.promises.readFile(filepath);


async function buscarArquivo(){
    try{
        const arquivo = await fs.promises.readFile(filepath)
        const textoArquivo = arquivo.toString('utf-8')
        console.log(textoArquivo)

    }catch(error){
        console.error(error)
    }finally{
        console.log('finalizou!')
    }
}

buscarArquivo()