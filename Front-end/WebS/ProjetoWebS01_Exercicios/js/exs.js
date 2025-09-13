// Ex01


    // let myName = "Daniel"
    // let myLuckyNumber = 20

    // alert(myName + " " + myLuckyNumber);


// Ex02

    // const MESSAGE = " TASTE THE RAINBOW! ";

    // let whisper = MESSAGE.toLowerCase().trim();

    // console.log(whisper);



// Ex03

    // const WORD = "skateboard";

    // console.log(WORD)

    // let facialHair = WORD.slice(5).replace("o", "e");

    // console.log(facialHair)

    // let fullName = "Sara Monteiro"

    // console.log(fullName)

    // let firstName = fullName.slice(0, fullName.indexOf(" "))

    // console.log(firstName)


// Ex04

    // String templates

    // let myName = "Daniel"
    // let myLuckyNumber = 20

    // console.log(`O meu nome é ${myName} e o meu número preferido é ${myLuckyNumber}`)


// Ex05

    // let yourName = null

    // let yourFirstName = prompt("Diz-me o seu primeiro nome")
    // let yourLastName = prompt("Diz-me o seu apelido")

    // console.log(`Olá, ${yourFirstName} ${yourLastName}`)

    // let nomeDaPessoa = yourFirstName + " " + yourLastName

    // console.log("Olá, " + nomeDaPessoa)


// Ex06

    // const ageOfConsent = 18

    // let userAge = parseInt(prompt("Que idade tens?")) // parseInt transforma a variável string em numero


// Ex07

    // diaDaSemana = prompt("Que dia da semana é hoje?");

    // if (diaDaSemana.toUpperCase().trim() == "SEXTA" || diaDaSemana == "SEXTA-FEIRA"){
    //     console.log("yaay, sobrevivemos a mais uma semana")
    // } else {
    //     switch (diaDaSemana) {

    //         case "SEGUNDA":
    //             console.log("Força! Ainda há muito o que fazer!")
    //         break;

    //         case "SEGUNDA-FEIRA":
    //             console.log("Força! Ainda há muito o que fazer!")
    //         break;
        
    //         case "TERÇA":
    //             console.log("Um já foi! Faltam quatro!")
    //         break;

    //         case "TERÇA-FEIRA":
    //             console.log("Um já foi! Faltam quatro!")
    //         break;

    //         case "QUARTA":
    //             console.log("Chegaste a metade!")
    //         break;

    //         case "QUARTA-FEIRA":
    //             console.log("Chegaste a metade!")
    //         break;

    //         case "QUINTA":
    //             console.log("Quinta é quase sexta!")
    //         break;

    //         case "QUINTA-FEIRA":
    //             console.log("Quinta é quase sexta!")
    //         break;

    //         case "SABADO":
    //             console.log("Sabadou!")
    //         break;

    //         case "DOMINGO":
    //             console.log("Domingou!")
    //         break;

    //         default:
    //             console.log("resposta inválida")
    //     }
        
    // }

// Ex08

    // let password = prompt("Crie uma password com pelo menos 6 caracteres")


    // if(password.length < 6){
    //     alert("password inválida por conter menos de 6 caracteres")
    // } else {
    //     alert("password ok")
    // }

// Métodos de Arrays

    // ambos tem dentro o A:
    // let weekDays = ['segunda', 'terça', 'quarta']
    // weekDays[1][4]
    // let myDay = weekDays [1]
    // console.log(myDay[4])

    // let shoppingList = ["batatas"];
     
    // let item = prompt("Qual é o item a adicionar");

    // shoppingList.push(item)

    //console.log(shoppingList)

    // Para modificar arrays:
    //     Push: adiciona ao fim
    //     Pop: remove do fim
    //     Shift: remove do início
    //     Unshift: adiciona ao Início

    // Outros Métodos
    //     Concat: junta arrays;
    //     Includes: procura um valor;
    //     IndexOf (igual ao das srings);
    //     Join: transforma um array numa string;
    //     Reverse: muda a ordem para a inversa.
    //     Slice: copia / retira uma parte.
    //     Splice: remove ou substitui elementos.
    //     Sort: ordena um array

    // let frutas = ["maçã", "banana", "laranja", "manga", "uva"];
    // let indiceParaRemover = 2; // Remover "laranja"

    // frutas.splice(indiceParaRemover, 1);

    // console.log(frutas); // Saída: ["maçã", "banana", "manga", "uva"]


    // Obs: shortcut para comentar mais de uma linha: ctrl KC


// Ex09 (p.43)

    // let planetas = ["Mercúrio", "Vénus", "Terra", "Mart", "Jupiter", "Saturno", "Urano", "Neptuno", "Plutão"];

    // planetas[3] = "Marte";

    // planetas.pop();

    // planetas.unshift("Minerva");

    // console.log(planetas)





// Loops (p. 52)

    // For loop
    // While loop
    // For .. of loop
    // For .. in loop


// Ex p.55

    // let i = 0

    // while (i < 6) {
    //     console.log(i + " Da ba dee da ba daa")
    //     i++
    // }

    // for (let j = 25; j>0; j-=5) {
    //     console.log(j)
    // }


// Ex p. 62

    // let listaCompras = []
    // let item = ""

    // while (item.toLowerCase().trim() != "fim") {
    //    item = prompt("Adicione um item à lista de compras:")
    //    if (item !== "fim" && item!== "apagar" && item !== null) {
    //     listaCompras.push(item)
    //    } else if (item == "apagar") {
    //     item = prompt("O que quer apagar?")
    //     let indice = listaCompras.indexOf(item)
    //     listaCompras.splice(indice,1)
    //    }
    // }

    // console.log(listaCompras)


    // for(let i=0; i<listaCompras.length; i++) {
    //     console.log(" compre " + listaCompras[i])
    // }

    // Solução com for of:
    // for (let element of listaCompras) {
    //     console.log(" compre " + element)
    // }


// Obs: ctrl shift R para dar refresh no browser


// Ex p. 58

    //  const people = ["Scooby", "Velma", "Daphne", "Shaggy", "Fred"];


    //  for(let i=0; i<people.length; i++) {
    //     console.log("a personagem é " + people[i].toUpperCase())
    // }


// Ciclo for..in e for..of (js, php, python):

    // Enquanto o for...in interage com o nome das 
    // propriedades, o for...of interage com o valor 
    // das propriedades.

    // for (let element of planetas) {
    //     console.log(element)
    // }


    // const pessoa = {
    //   nome: "Alice",
    //   idade: 30,
    //   profissao: "Engenheira"
    // };

    // for (const propriedade in pessoa) {
    //   console.log(propriedade); // Saída: nome, idade, profissao
    //   console.log(pessoa[propriedade]); // Saída: Alice, 30, Engenheira
    // }

// Ex pag 47

    // const airplaneSeats = [
    //  ['Ruth', 'Anthony', 'Stevie'],
    //  ['Amelia', 'Pedro', 'Maya'],
    //  ['Xavier', 'Ananya', 'Luis'],
    //  ['Luke', null, 'Deniz'],
    //  ['Rin', 'Sakura', 'Francisco']
    //  ];

    //  airplaneSeats[3][1] = 'Daniel'
    //  console.log(airplaneSeats)


// Objetos:

// let courseStructure = { 
// // usa-se colchetes para declarar um objeto
// // um objeto é composto por um conjunto de chaves('etiquetas') e valores

//     courseName: 'Software Developer', // a chave é courseName, o valor é 'Software Developer'
//     hours: 1000,
//     modules: ['js', 'algoritmia', 'mysql'] // os valores podem ser strings, numeros, arrays etc

// }

// console.log(courseStructure.modules[1]) //objeto.chave

// Ex pag 50

    // let product = {

    //     name: 'crochet',
    //     inStock: true,
    //     price: 1.99,
    //     moeda: '€',
    //     color: ['vermelho', 'azul', 'verde'],
    // }

    // console.log(`O preço do prodtuto é ${product.price} ${product.moeda} e a cor é ${product.color[2]}`)

    // product.price = 2.55

    // console.log(`Agora o preço do produto é ${product.price} ${product.moeda}`)


// Funções

// function myShoppingList () {

//     let listaCompras = []
//     let item = ""

//     while (item.toLowerCase().trim() != "fim") {
//         item = prompt("Adicione um item à lista de compras:")
//         if (item !== "fim" && item!== "apagar" && item !== null) {
//         listaCompras.push(item)
//         } else if (item == "apagar") {
//         item = prompt("O que quer apagar?")
//         let indice = listaCompras.indexOf(item)
//         listaCompras.splice(indice,1)
//         }
//     }


//     for(let i=0; i<listaCompras.length; i++) {
//         console.log(" compre " + listaCompras[i])
//     }


// }

// Ex p 86

// const fullNames = [
//     {first: 'Albus', last: 'Dumbledore'}, 
//     {first: 'Harry', last: 'Potter'}, 
//     {first: 'Hermione', last: 'Granger'}, 
//     {first: 'Ron', last: 'Weasley'}, 
//     {first: 'Rubeus', last: 'Hagrid'}, 
//     {first: 'Minerva', last: 'McGonagall'}, 
//     {first: 'Severus', last: 'Snape'}
// ];

// const firstNames = fullNames.map(function (elementos){
//     return elementos.first;
// })

// console.log(firstNames)

// fullNames.forEach (function (item){
//     console.log(`O nome completo da personagem é  ${item.first} ${item.last}`)
// })

// Ex p 88

// let nome = prompt("Qual o seu nome?")

// greet = (nome) => {
//     return "Hey " + nome + "!";
// }

// let heyNome = greet(nome)


// let myName = "Daniel"

// myName = prompt("Qual é o seu nome?")

// greet = (nome) => {
//     return "Hey " + nome + "!";
// }

// console.log(greet(myName))

// let myName = "Daniel"

// myName = prompt("Qual é o seu nome?")

// const greet = nome => "Hey " + nome + "!";

// console.log(greet(myName))























