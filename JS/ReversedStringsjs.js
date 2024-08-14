/* 8KYU CodeWarss Reversed Strings

Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'


*/
function solution(str){
    let strRev = "";
    for (let i = str.length - 1; i >= 0; i--) {
        strRev += str[i];
    }
  return strRev;
}
/*---------------------------------------------------------------------
function solution(str){
  return str.split('').reverse().join('');  
}
-----------------------------------------------------------------------
const solution = str => str.split('').reverse().join('');
------------------------------------------------------------------------
const solution = s => [...s].reverse().join('')
-----------------------------------------------------------------------
function solution(s){
  var o = '';
  for (var i = s.length - 1; i >= 0; i--)
    o += s[i];
  return o;
}
-----------------------------------------------------------------------
function solution(str) {
 
  let splitString = str.split(''); 
  
  let reverseArray = splitString.reverse();
  
  let joinArray = reverseArray.join('');
  
  return joinArray;
  
}

console.log(solution('world'));
------------------------------------------------------------------------
let solution = str => [...str].reverse().join('');
*/