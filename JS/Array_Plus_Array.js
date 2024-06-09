/* 8KYU CodeWars Array Plus Array

I'm new to coding and now I want to get the sum of 
two arrays... Actually the sum of all their elements. 
I'll appreciate for your help.

P.S. Each array includes only integer numbers. Output 
is a number too.

*/
function arrayPlusArray(arr1, arr2) {
  let result = 0;
  for (let i = 0; i < arr1.length; i++) {
    result += arr1[i];
  }
  for (let i = 0; i < arr2.length; i++) {
    result += arr2[i];
  }
  return result;
}
/*---------------------------------------------------
function arrayPlusArray(arr1, arr2) {
  return arr1.concat(arr2).reduce((acc, cur) => acc + cur);
}
-----------------------------------------------------
function arrayPlusArray(arr1, arr2) {
  let arr = [...arr1, ...arr2];
  return arr.reduce((a, b) => a + b);
}
-----------------------------------------------------
function arrayPlusArray(...arrays) {
  return [].concat(...arrays).reduce((a,b) => a+b,0)
}
-----------------------------------------------------
function arrayPlusArray(arr1, arr2) {
  var suma=0;
  for(var i=0;i<arr1.length;i++)
    suma+=arr1[i];
  for(var i=0;i<arr2.length;i++)
    suma+=arr2[i];
  return suma;
}
-----------------------------------------------------
const arrayPlusArray = (arr1, arr2) => [...arr1, ...arr2].reduce((a, b) => a + b, 0);
-----------------------------------------------------
function arrayPlusArray(arr1, arr2) {
  return arr1.concat(arr2).reduce((a, b) => a + b)
}
*/