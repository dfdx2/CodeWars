/* 8KYU CodeWars Fundamentals: Return 

Make multiple functions that will return the sum, difference, modulus, product, quotient, and the exponent respectively.

Please use the following function names:

addition = add

multiply = multiply

division = divide (both integer and float divisions are accepted)

modulus = mod

exponential = exponent

subtraction = subt

Note: All math operations will be: a (operation) b

*/

function add(a,b){
    return a + b
}

function divide(a,b){
    return a / b
}

function multiply(a,b){
    return a * b
}

function mod(a,b){
    return a % b
}
   
function exponent(a,b){
    return a ** b
}
    
function subt(a,b){
    return a - b
}
/*---------------------------------------------------------
const add = (a, b) => a + b;
const subt = (a, b) => a - b;
const divide = (a, b) => a / b;
const multiply = (a, b) => a * b;
const mod = (a, b) => a % b;
const exponent = (a, b) => a ** b;
-----------------------------------------------------------
{var {add, subtract, multiply, divide, modulo} = require('ramda') 
var [mod, subt, exponent] = [modulo, subtract, Math.pow]}
-----------------------------------------------------------
const [{pow: exponent}, {add, subtract: subt, multiply, divide, modulo: mod}] = [Math, require('ramda')] 
-----------------------------------------------------------
add = (a,b) => a + b
subt = (a,b) => a - b
multiply = (a,b) => a * b
divide = (a,b) => a / b
exponent = (a,b) => a ** b
mod = (a,b) => a % b
------------------------------------------------------------
const {add, divide, multiply, modulo: mod, subtract: subt} = require('ramda');
const {pow: exponent} = Math;
----------------------------------------------------------
const add = (_, __) => _ + __

const divide =  (_, __) => _ / __

const multiply =  (_, __) => _ * __

const mod = (_, __) => _ % __
   
const exponent = (_, __) => _ ** __
    
const subt = (_, __) => _ - __
------------------------------------------------------------
const calc = {
  add:      (...arg) => arg.reduce((a, b) => a + b),
  multiply: (...arg) => arg.reduce((a, b) => a * b),
  divide:   (...arg) => arg.reduce((a, b) => a / b),
  mod:      (...arg) => arg.reduce((a, b) => a % b),
  exponent: (...arg) => arg.reduce((a, b) => a ** b),
  subt:     (...arg) => arg.reduce((a, b) => a - b),
};

const add = calc.add;
const multiply = calc.multiply;
const divide = calc.divide;
const mod = calc.mod;
const exponent = calc.exponent;
const subt = calc.subt;
------------------------------------------------------------
let add = (a, b) => a + b
let divide = (a, b) => a / b
let multiply = (a, b) => a * b
let mod = (a, b) => a % b
let exponent = (a, b) => a ** b
let subt = (a, b) => a - b
*/