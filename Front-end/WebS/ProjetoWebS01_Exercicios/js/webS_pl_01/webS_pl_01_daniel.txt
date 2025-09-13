
// Cesae - Software Developer - turma: abril/2025 - Daniel Caseiro
// Programação WEB - WebS
// PRATICA LABORAL 01


// Ex 01
function multiply (num1, num2) {
    return num1 * num2
}


// Ex 02
function isShortsWeather (temperature){
    if(temperature > 25) {
        return true
    } else {
        return false
    }
}


// Ex 03
function lastElement (array) {

    if (array[0] != undefined) {
        return array[array.length -1]
    } else {
        return null
    }


    
}


// Ex 04
function sumArray (array) {

    sum = 0

    for (let i = 0; i < array.length; i++) {
        sum += array[i]
    }

    return sum
}


// Ex 05
function returnDay (dayNumber) {

    switch(dayNumber){

        case 1:
            return 'segunda'
            break
        
        case 2:
            return 'terça'
            break

        case 3:
            return 'quarta'
            break

        case 4:
            return 'quinta'
            break

        case 5:
            return 'sexta'
            break

        case 6:
            return 'sábado'
            break

        case 7:
            return 'domingo'
            break

        default:
            return null
    }

}