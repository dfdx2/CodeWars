/* 8KYU CodeWars Convert a String To a Number

Description
We need a function that can transform a string into a 
number. What ways of achieving this do you know?

Note: Don't worry, all inputs will be strings, and every 
string is a perfectly valid representation of an integral
number.

Examples
"1234" --> 1234
"605"  --> 605
"1405" --> 1405
"-7" --> -7

*/

const stringToNumber = function(str){
    return Number(str);
}

/*--------------------------------------------------
var stringToNumber = function(str){
  return parseInt(str);
}
----------------------------------------------------
var stringToNumber = function(str){
  return +str;
}
----------------------------------------------------
const stringToNumber = str => Number(str)
----------------------------------------------------
var stringToNumber = Number;
----------------------------------------------------
var stringToNumber = function(str){
  return parseInt(str, 10);
}
----------------------------------------------------
const stringToNumber = (str) => +str
---------------------------------------------------
const stringToNumber = Number
---------------------------------------------------
const stringToNumber = function(str, arr = [...str], out = 0){
  if( arr[0] === '-' ){ arr.shift() }
  arr.reverse()
  
  const nums = {1: 1, 2: 2, 3: 3, 4: 4, 5: 5, 6: 6, 7: 7, 8: 8, 9: 9, 0: 0}
  for (let i = 0; i < arr.length; i++){
      out += nums[arr[i]] * (10**i)
    }
  return str[0] === '-' ? -out : out
}
*/