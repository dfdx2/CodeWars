/* 7KYU CodeWars No Oddities Here

Write a small function that returns the values of 
an array that are not odd.

All values in the array will be integers. Return 
the good values in the order they are given.

*/
function noOdds( values ){
  const result = [];
  for (let i = 0; i < values.length; i++) {
    if (values[i] % 2 == 0) {
      result.push(values[i]);
    }
  }
  return result;
}
/*----------------------------------------------------------------
var noOdds = values => values.filter(x => x % 2 === 0);
------------------------------------------------------------------
function noOdds( values ){
  function isEven(number){
	return number%2 == 0;
  }
  
  return values.filter(isEven);
}
------------------------------------------------------------------
var noOdds = values => values.filter(x => !(x % 2));
------------------------------------------------------------------
function noOdds( values ){
  // Return all non-odd values
  var goodies = [];
  for(var i=0; i<values.length;i++){
      if(values[i]%2 == 0){
        goodies.push(values[i]);
      }
  }
  
  return goodies;
}
------------------------------------------------------------------
function noOdds( values ){
  // Return all non-odd values
  return values.filter(function(data){
    return data % 2 === 0
  });
}
------------------------------------------------------------------
const noOdds = function ( values ){ return values.filter(el => el % 2 ===0) }
------------------------------------------------------------------
function noOdds(values){
  return values.filter(num => Math.abs(num % 2) !== 1);
}
------------------------------------------------------------------
function noOdds( values ){
  return values.filter(e => e % 2 == 0)
}
*/