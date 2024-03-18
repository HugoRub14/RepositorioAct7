var result = 5;
var result2 = 2;
result *= result2; 

var finalResult = result.toFixed(2);

var finalNumber;
if (typeof finalResult === 'string') {
    finalNumber = parseFloat(finalResult); 
}

console.log(typeof finalResult);

console.log(typeof finalNumber);
console.log("Valor de finalResult:", finalResult); 
console.log("Valor de finalNumber antes de la conversión:", finalNumber);

finalNumber = parseFloat(finalResult);

console.log("Tipo de dato de finalNumber después de la conversión:", typeof finalNumber);
console.log("Valor de finalNumber después de la conversión:", finalNumber);
