/* 8KYU CodeWars Simple Multiplication

This kata is about multiplying a given number by 
eight if it is an even number and by nine otherwise.

*/
function simpleMultiplication(number) {
    return number % 2 == 0 ? number * 8 : number * 9;
}
/*-----------------------------------------------------
function simpleMultiplication(n) {
    return n * (n % 2 ? 9 : 8);
}
-------------------------------------------------------
function simpleMultiplication(value){
    
    if(value%2===0 ){
     return value *8
    }
    else{
    return value* 9;
    }    
}
-------------------------------------------------------
const simpleMultiplication=n=>n*(n%2?9:8)
-------------------------------------------------------
function simpleMultiplication(number) {
  if (typeof number === 'number') {
    return number * (8 + number % 2);
  } else {
    console.log(arguments.callee.name + ': Invalid argument');
  }
}
-------------------------------------------------------
const simpleMultiplication = number => number%2 ? number * 9 : number * 8;
-------------------------------------------------------
const simpleMultiplication = number =>
  (8 + number % 2) * number;
*/