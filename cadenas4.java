var theoremName = "Teorema de Pitágoras";
var side1 = 3;
var side2 = 4;

var hypotenuse = Math.sqrt(side1 ** 2 + side2 ** 2);

var finalString = `${theoremName} dice que en un triángulo rectángulo con lados de longitud ${side1} y ${side2}, la longitud de la hipotenusa es ${hypotenuse.toFixed(2)}.`;

console.log(finalString);
