/* 7KYU CodeWars Check the exam

The first input array is the key to the correct answers 
to an exam, like ["a", "a", "b", "d"]. The second one 
contains a student's submitted answers.

The two arrays are not empty and are the same length. 
Return the score for this array of answers, giving +4 
for each correct answer, -1 for each incorrect answer, 
and +0 for each blank answer, represented as an empty 
string (in C the space character is used).

If the score < 0, return 0.

For example:

    Correct answer    |    Student's answer   |   Result         
 ---------------------|-----------------------|-----------
 ["a", "a", "b", "b"]   ["a", "c", "b", "d"]  →     6
 ["a", "a", "c", "b"]   ["a", "a", "b", "" ]  →     7
 ["a", "a", "b", "c"]   ["a", "a", "b", "c"]  →     16
 ["b", "c", "b", "a"]   ["" , "a", "a", "c"]  →     0



*/

function checkExam(array1, array2) {
 let result = 0;
  for (let i = 0; i < array1.length; i++) {
    if (array1[i] == array2[i]) {
      result += 4;
    }
    else if (array2[i] == "") {
      result += 0;
    }
    else {
      result -= 1;
    }
  }
  return result < 0 ? 0 : result;
}
/*-------------------------------------------------------------
function checkExam(array1, array2) {
  const reducer = (a, e, idx) => {
    if (e === "") {
      return a;  
    }
    
    if (e === array1[idx]) {
      return a += 4;
    }
    
    return --a;
  }
  const score = array2.reduce(reducer, 0);
  return score < 0 ? 0 : score;
}
---------------------------------------------------------------
checkExam = (x, y) => (x = y.reduce((s, e, i) => s + (e === x[i] ? 4 : e === '' ? 0 : -1), 0)) > 0 ? x : 0;
---------------------------------------------------------------

---------------------------------------------------------------
const checkExam = (array1, array2) => {
  let result = array2.reduce(
    (score, answer, i) => {
      if(answer == array1[i]) return score += 4;
      else if(answer == 0) return score += 0;
      else return score - 1;
    }
  , 0);
  return result < 0 ? 0 : result;
}
---------------------------------------------------------------
function checkExam(array1, array2) {
 var score = 0;
   for (var i = 0; i < array2.length; i++){
       if (array2[i] === ""){
          score += 0
       } else if (array1[i] === array2[i]){
           score += 4
       } else if (array1[i] !== array2[i]){
          score -= 1
       }
   } 
     if (score >= 0){
       return score;
     } else {
       return 0
     }
}
---------------------------------------------------------------
checkExam=(arr1,arr2)=>Math.max(arr2.reduce((a,b,i) =>b==arr1[i]?a+4:b?a-1:a,0),0)
---------------------------------------------------------------
function checkExam(arr1, arr2) {
  let result = arr2.reduce((c, el, i) => el.length ? (el == arr1[i] ? c+4 : c-1) : c, 0);
  return result < 0 ? 0 : result;
}
----------------------------------------------------------------
const checkExam = (array1, array2) =>
  Math.max(array2.reduce((pre, val, idx) => val ? val === array1[idx] ? pre + 4 : --pre : pre, 0), 0);
----------------------------------------------------------------
function checkExam(array1, array2) {
  const arr = array2.map((el,i)=> array1[i] === el ? 4 : el === '' ? 0 : -1)
  return arr.reduce((a,b)=> a+b, 0) > 0 ? arr.reduce((a,b)=> a+b, 0) : 0
}
*/