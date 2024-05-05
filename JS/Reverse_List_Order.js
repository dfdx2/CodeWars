/* 8KYU CodeWars Reverse List Order

In this kata you will create a function that takes in a list and returns a list with the reverse order.

Examples (Input -> Output)
* [1, 2, 3, 4]  -> [4, 3, 2, 1]
* [9, 2, 0, 7]  -> [7, 0, 2, 9]

*/
function reverseList(list) {
    return list.reverse();
}
/*------------------------------------------------------------
const reverseList = list => list.reverse();
--------------------------------------------------------------
function reverseList(list) {
  return list.slice().reverse();
}
--------------------------------------------------------------
function reverseList(list) {
  var array = [];
  for (var i = list.length-1; i >= 0; i --){
    array.push(list[i]);
  }
  return array;
}
--------------------------------------------------------------
function reverseList(list) {
  return [...list].reverse();
}
--------------------------------------------------------------
reverseList = a => a.reverse();
--------------------------------------------------------------
const reverseList = ([h, ...t]) => h == undefined ? [] : [...reverseList(t), h];
---------------------------------------------------------------
reverseList=l=>l.map((e,i)=>l[l.length-1-i])
---------------------------------------------------------------
const reverseList = list => list.reduceRight((arr, v) => arr.concat(v),[])
----------------------------------------------------------------
function reverseList(list) {
  const result=[];
  for (item of list) result.unshift(item);
  return result;
}
----------------------------------------------------------------
function reverseList(list) {
  return list.reduce((reverseList, element) => [element, ...reverseList], []);
}
*/