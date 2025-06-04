// Ex p 65

// Obs: os métodos são funções (Ex: .toLowerCase(), etc)
// não precisamos importar as funções métodos pq elas já estão no browser

function printHeart() {

    alert("❤️")

}

// Exemplo 1 de funções dentro de funções
// neste caso, o botão só deve chamar a função hate

    // function hate () {
    //     let odio = prompt('O que é que odeias?')
    //     rant(odio)
    // }

    // function rant(message) {
    //     for (let i=1; i<=3; i++){
    //         console.log(i + ' Odeio ' + message.toUpperCase())
    //     }
    // }

// Exemplo 2
// neste caso, o botão deve chamar ambas as funções na forma rant(hate())
// ou seja, chama a função rant e passa a função hate como argumento

function hate () {
    let odio = prompt('O que é que odeias?')
    return odio
}

function rant(message) {
    for (let i=1; i<=3; i++){
        console.log(i + ' Odeio ' + message.toUpperCase())
    }
}

// Ex p 72

function isSnakeEyes (num1, num2) {
    if (num1 == 1 && num2 == 1){
        alert('Yay, snake eyes')
    } else {
        alert('Não são olhos de cobra')
    }
}

function isSnakeEyesPrompt () {

    num1 = prompt('Diz-me um primeiro número')
    num2 = prompt('Diz-me um segundo número')

    isSnakeEyes (num1, num2)
}

// Ex p 94

// const userNames = ["mark", "staceysmom1978", "q29832128238983", "carrie98", "Moana Fan"]


// Duas possibilidades de sintaxe:

function validUserNames(arrayUserNames){
    const filteredUserNames = arrayUserNames.filter(userName =>{
        return userName.length < 10
    }
)
    return filteredUserNames
}

function validUserNames(arrayUserNames){
    return arrayUserNames.filter(names => names.length < 10)

}

validUserNames(["mark", "staceysmom1978", "q29832128238983", "carrie98", "Moana Fan"])



// Ex p 97

arrayNumeros1 = [1,2,3,4,5,6,7,8,9]

arrayNumeros2 = [2,4,6,8,10,12,14,16]


function allEvens(arrayNumeros) {
    return arrayNumeros.every(numero => numero %2 === 0)
}


