/* 8KYU CodeWars Opposite Number

Very simple, given a number (integer / decimal / both depending on the language), 
find its opposite (additive inverse).

Examples:

1: -1
14: -14
-34: 34

*/
function opposite(number) {
  return number == 0 ? 0 : number > 0 ? -number : Math.abs(number);
}
/*------------------------------------------------------------------
function opposite(number) {
  return(-number);
}
--------------------------------------------------------------------
const opposite = number => -number;
--------------------------------------------------------------------
function opposite(number) {
    return number * (-1);
}
--------------------------------------------------------------------
const opposite = n => -n;
--------------------------------------------------------------------
function opposite(number) {
  return number > 0 ? -number : Math.abs(number);
}
--------------------------------------------------------------------
const opposite = n => n * -1
--------------------------------------------------------------------
function opposite(n) {return -n}

*/