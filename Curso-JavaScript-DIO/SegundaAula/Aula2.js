//exercicio IMC com funções 
function calcIMC(peso, altura){
    return peso / Math.pow(altura, 2); 
}
function classificarIMC(imc){
    if(imc < 18.5){
        return "abaixo do peso, imc igual a: "+ imc;
    }else if(imc >= 18.5 && imc <= 25){
        return "peso normal, imc igual a: "+ imc;
    }else if(imc > 25 && imc <= 30){
        return "acima do peso, imc igual a: "+ imc;
    }else if(imc >30 && imc <= 40){
        return "obeso, imc igual a: "+ imc;
    }else if(imc > 40){
        return "Obesidade grave, imc igual a: "+ imc;
    }
}
function main(){
    const peso = 56.5;
    const altura = 1.78;
    const imc = calcIMC(peso, altura);
    console.log(classificarIMC(imc));
}
main();


