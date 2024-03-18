var quote = "Me gustan los huevos verdes y el jamón";
var substring = "gustan";

var quoteLength = quote.length;

var index = quote.indexOf(substring);

var revisedQuote = quote.slice(0, index) + "No " + quote.slice(index);

console.log("Longitud de la cita:", quoteLength);
console.log("Posición del índice de la subcadena:", index);
console.log("Cita revisada:", revisedQuote);
