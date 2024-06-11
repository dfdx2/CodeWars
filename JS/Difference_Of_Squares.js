/* 7KYU CodeWars Difference of Squares

Recreation of Project Euler problem #6

Find the difference between the sum of the squares 
of the first n natural numbers (1 <= n <= 100) and 
the square of their sum.

Example

For example, when n = 10:

The square of the sum of the numbers is:

(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10)2 = 552 = 3025

The sum of the squares of the numbers is:

12 + 22 + 32 + 42 + 52 + 62 + 72 + 82 + 92 + 102 = 385

Hence the difference between square of the sum of the 
first ten natural numbers and the sum of the squares of 
those numbes is: 3025 - 385 = 2640

*/
function differenceOfSquares(n) {
  let a = 0;
  let b = 0;
  let result = 0;
  for (let i = 1; i <= n; i++) {
    a += i;
  }
  a = a * a;
  for (let i = 1; i <= n; i++) {
    b += i * i;
  }
  result = a - b;
  return result;
}
/*-----------------------------------------------------------------
function differenceOfSquares(x){
  var sum = 0, squareSum = 0, i;
  for (i =1 ; i <= x; i++) {
    sum += i*i;
    squareSum += i;
  }
  return squareSum*squareSum - sum;
}
-------------------------------------------------------------------
differenceOfSquares=x=>x*(x*x-1)*(3*x+2)/12
-------------------------------------------------------------------
function differenceOfSquares(x) {
  return Math.pow(x * (x + 1) / 2, 2) - Math.round(x / 6 * (x + 1) * (2 * x + 1))
}
-------------------------------------------------------------------
function differenceOfSquares(x){
  return Math.pow((x*(x+1)/2), 2) - (x*(x+1)*(2*x+1)/6);
}
-------------------------------------------------------------------
const differenceOfSquares = x => Math.pow(x * (x + 1) / 2, 2) - x * (x + 1) * (2 * x + 1) / 6;
-------------------------------------------------------------------
const differenceOfSquares = n =>
  (n * (n + 1) / 2) ** 2 - (n * (n + 1) * (2 * n + 1) / 6);
-------------------------------------------------------------------
function differenceOfSquares(n){
  let sqrSum = 1;
  let sumSqrt = 1;
  while(n > 1) {
    sqrSum += n;
    sumSqrt = sumSqrt + n**2;
    n--;
  }
  return (sqrSum ** 2)- sumSqrt;
}
*/
