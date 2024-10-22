//manipulação de listas
//forEach
const lista = [1, 2, 3, 4, 5, 6, 7, 8]

lista.forEach((value)=>{
    console.log(value )
})

//Filter

const listaNumPar = lista.filter((element, i, listRef)=>{
    return (element %2 === 0)
})
console.log(lista)
console.log(listaNumPar)

//Map

class Pessoa{
    constructor(name){
        this.name = name
    }
}
const lista2 = [new Pessoa("luis", new Pessoa("Carlos"), new Pessoa("lumens"))]

console.log(lista2)

const listaNomes = lista2.map((elemento)=> elemento.name)
console.log(listaNomes)

//reduce

const somaDeTodosOsNumeros = lista.reduce((previous, current)=>{
    return previous+ current
}, 0)
console.log(somaDeTodosOsNumeros)

//join

console.log(lista.join('/'))
console.log(lista2.join('/'))
console.log(listaNomes.join('/'))