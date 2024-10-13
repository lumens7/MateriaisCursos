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
function main(){
    const produto = 100;
    const condicaoPGTO = "credito";
    const parcelas = 1;
    classificarCondicaoPGTO(condicaoPGTO, parcelas, produto)

}
function classificarCondicaoPGTO(condicaoPGTO, parcelas, produto){
    if(condicaoPGTO == "debito" && parcelas === 1){
        console.log(pgtoDebito(produto));
    }else if(condicaoPGTO == "pix" || condicaoPGTO == "dinheiro" && parcelas === 1){
        
        console.log(pgtoAvista(produto));
    }else if( condicaoPGTO == "credito"){
        if(parcelas <= 2){
            console.log("O valor a ser pago pelo produto é de R$" + produto);
        }else if( parcelas> 2){
            console.log(pgtoCredito(produto));
        }
    }
}
function pgtoDebito(produto){
    const pgtoDeb = produto - ((produto*10)/100);
    return "O valor a ser pago pelo produto é de R$" + pgtoDeb;
}
function pgtoAvista(produto){
    const pgtoAvista = produto - ((produto*15)/100);
    return "O valor a ser pago pelo produto é de R$" + pgtoAvista;
}
function pgtoCredito(produto){
    const pgtoCredito = produto + ((produto*10)/100);
    return "O valor a ser pago pelo produto é de R$" + pgtoCredito;
}

main();