/* 8KYU CodeWars Sum Of Postitive

You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.

*/

function positiveSum(arr) {
  let result = 0;
  let i = 0;
  while (i < arr.length) {
    if (arr[i] > 0) {
      result += arr[i];
      i++;
    }
    else {
      i++;
    }
  }
  return result;
}
/*---------------------------------------------------------------------
function positiveSum(arr) {
  var total = 0;    
  for (i = 0; i < arr.length; i++) {    // setup loop to go through array of given length
    if (arr[i] > 0) {                   // if arr[i] is greater than zero
      total += arr[i];                  // add arr[i] to total
    }
  }
  return total;                         // return total
}
----------------------------------------------------------------------
function positiveSum(arr) {
   return arr.reduce((a,b)=> a + (b > 0 ? b : 0),0);
}
------------------------------------------------------------------------
function positiveSum (arr) {
  return arr.filter(x => x>=0).reduce((a, c) => a + c, 0);
}
------------------------------------------------------------------------
function positiveSum(arr) {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > 0) {
      sum += arr[i];
      }
  }
  return sum;
}
-----------------------------------------------------------------------
function positiveSum(arr) {
  var sum = 0;
  arr.forEach(function(v,i,a) {
    if(v>0){sum+=v;}
  });
  return sum;
}
--------------------------------------------------------------------------
function positiveSum( obj ) {
  return obj.map(el => el < 0 ? 0 : el).reduce((acc, i)=> acc + i, 0)
}
-----------------------------------------------------------------------
function positiveSum(arr) {
  return arr.reduce((s,v) => v > 0 ? s + v : s, 0);
}
------------------------------------------------------------------------
function positiveSum(arr) {
  return arr.filter(num => num >= 0).reduce((prev, curr) => prev + curr, 0);
}

*/