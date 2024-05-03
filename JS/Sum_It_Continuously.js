/* 7KYU CodeWwars Sum It Continuously

Make a function "add" that will be able to sum elements 
of list continuously and return a new list of sums.

For example:

add [1,2,3,4,5] == [1, 3, 6, 10, 15], because it's calculated like 
this : [1, 1 + 2, 1 + 2 + 3, 1 + 2 + 3 + 4, 1 + 2 + 3 + 4 + 5]
If you want to learn more see https://en.wikipedia.org/wiki/Prefix_sum

*/
function add(arr) {
  const result = [];
  let x = 0;
  for (let i = 0; i < arr.length; i++) {
    result[i] = x += arr[i];
  }
  return result;
}
/*------------------------------------------------------------
function add(arr) {
  let sum = arr[0];
  const result = [];
  
  for(let i = 1; i <= arr.length; i++) {
    result.push(sum);
    sum += arr[i];
  }
  
  return result;
}
--------------------------------------------------------------
function add(a){
  let t = 0
  return a.map(e=>t+=e)
}
-------------------------------------------------------------
const add = arr => arr.map((sum => value => sum += value)(0));
--------------------------------------------------------------
const add = arr => {
  let sum = 0
  return arr.reduce((a,c) => {
    sum += c
    a.push(sum)
    return a
  },[])
}
--------------------------------------------------------------
const add = arr => arr.map((_, i, arr) => arr.slice(0, i + 1).reduce((acc, x) => acc + x)) 
--------------------------------------------------------------
const add = arr =>  arr.reduce((acc, _, i, arr) => (acc.push(arr.slice(0, i + 1).reduce((acc2, y) => acc2 + y)), acc),[]); 
---------------------------------------------------------------
function add(arr) {
    const newArr = [];
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
        newArr.push(sum);
    }
    return newArr;
}
---------------------------------------------------------------
function add(arr) {
  let sums = []
  let sum = 0;
  for (let i of arr) {
    sum += i;
    sums.push(sum)
  }
  return sums;
}
*/