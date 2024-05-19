/* 7KYU CodeWars Multiples!

Make a program that takes a value (x) and returns "Bang" 
if the number is divisible by 3, "Boom" if it is divisible 
by 5, "BangBoom" if it divisible by 3 and 5, and "Miss" if 
it isn't divisible by any of them. Note: Your program should 
only return one value

Ex: 

Input: 105 --> Output: "BangBoom" 

Ex: 

Input: 9 --> Output: "Bang" 

Ex:

Input: 25 --> Output: "Boom"

*/

function multiple(x) {
  if (x % 15 == 0) {
    return "BangBoom";
  }
  if (x % 5 == 0) {
    return "Boom";
  }
  if (x % 3 == 0) {
    return "Bang";
  }
  return "Miss";
}
/*-----------------------------------------------------
function multiple(x) {
 return x % 15 == 0 ? "BangBoom" : x % 3 == 0 ? "Bang" : x % 5 == 0 ? "Boom" : "Miss"
}
-------------------------------------------------------
const multiple = x => {
  if (x % 5 === 0 && x % 3 === 0) return "BangBoom"
  if (x % 3 === 0) return "Bang"
  if (x % 5 === 0) return "Boom" 
  return 'Miss'
}
--------------------------------------------------------
function multiple(x) {
  if (x % 15 == 0){
    return "BangBoom";
  }
  else if (x % 5 == 0){
    return "Boom";
  }
  else if (x % 3 == 0){
    return "Bang";
  }
  else{
    return "Miss";
  }
}
--------------------------------------------------------
function multiple(x) {
  let value = "";
  if (x % 3 === 0) value += "Bang";
  if (x % 5 === 0) value += "Boom";
  
  return value.length === 0 ? "Miss" : value;
}
--------------------------------------------------------
const multiple = m => m % 15 == 0 ? "BangBoom" : m % 3 == 0 ? "Bang" : m % 5 == 0 ? "Boom" : "Miss"
--------------------------------------------------------
const multiple = $ =>
  !($ / 3 % 1) && !($ / 5 % 1) ? 'BangBoom' : !($ / 3 % 1) ? 'Bang' : !($ / 5 % 1) ? 'Boom' : 'Miss'
--------------------------------------------------------
function multiple(x) {
  // Good Luck
return (x%3===0&&x%5===0)?'BangBoom':(x%3===0)?'Bang':(x%5===0)?'Boom':'Miss'
}
------------------------------------------------------------
function multiple(x) {
  if(!(x % 15)) return 'BangBoom'
  if(!(x % 3)) return 'Bang'
  if(!(x % 5)) return 'Boom'
  return 'Miss'
}
*/