/* 7KYU CodeWars Double Every Other

Write a function that doubles every second integer in a list, starting from the left.

Example:

For input array/list :

[1,2,3,4]
the function should return :

[1,4,3,8]

*/
function doubleEveryOther(a) {
  for (let i = 0; i < a.length; i++) {
    if (i % 2 != 0) {
      a[i] = a[i] * 2;
    }
  }
  return a;
}
/*------------------------------------------
const doubleEveryOther = (a) => a.map((c,i) => i % 2 == 0 ? c : 2 * c);
--------------------------------------------
function doubleEveryOther(a) {
  for(let i = 1; i < a.length; i += 2) {
    a[i] *= 2;
  }
  return a;
}
--------------------------------------------
const doubleEveryOther = a =>
  a.map((val, idx) => val * (idx % 2 + 1));
--------------------------------------------
const doubleEveryOther = $ => $.map((_, i) => i % 2 ? _ * 2 : _ )
//this task is not for 7kyu may be 8kyu or even 9kyu
--------------------------------------------
const doubleEveryOther = (a) => a.map((e,i) => i%2 ? e*2 : e);
-------------------------------------------
const doubleEveryOther = ns =>
  ns.map((n, i) => n * (1 + i % 2));
-------------------------------------------
function doubleEveryOther(a) {
  let result = []
  
  for (let i = 0; i < a.length; i++){
    if (i % 2 === 1){
      result.push(a[i] * 2)
    } else {
      result.push(a[i])
    }
  }
  return result
}
*/
