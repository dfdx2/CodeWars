/* 8KYU CodeWars Grader

Create a function that takes a number as an argument 
and returns a grade based on that number.

Score	                                   Grade
Anything greater than 1 or less than 0.6	"F"
0.9 or greater	                            "A"
0.8 or greater	                            "B"
0.7 or greater	                            "C"
0.6 or greater	                            "D"

Examples:

grader(0)   should be "F"
grader(1.1) should be "F"
grader(0.9) should be "A"
grader(0.8) should be "B"
grader(0.7) should be "C"
grader(0.6) should be "D"

*/

function grader(score) {
  return score > 1 || score < 0.6 ? "F" : score >= 0.9 ? "A" : score >= 0.8 ? "B" : score >= 0.7 ? "C" : score >= 0.6 ? "D" : "F";
}
/*-----------------------------------------------------------------------
function grader(score) {
  if (score>1||score<0.6) return 'F'
  if (score<0.7) return 'D'
  if (score<0.8) return 'C'
  if (score<0.9) return 'B'
  return 'A'
}
-------------------------------------------------------------------------
function grader(score) {
  if (score > 1 || score < 0.6) return 'F';
  else if (score >= 0.9) return 'A';
  else if (score >= 0.8) return 'B';
  else if (score >= 0.7) return 'C';
  else if (score >= 0.6) return 'D';
}
-------------------------------------------------------------------------
grader = s => s > 1 || s < 0.6 ? 'F' : s < 0.7 ? 'D' : s < 0.8 ? 'C' : s < 0.9 ? 'B' : 'A';
-------------------------------------------------------------------------
const grader = s => {
  switch(true) {
    case (s > 1):
      return 'F'
    case (s >= 0.9):
      return 'A'
    case (s >= 0.8):
      return 'B'
    case (s >= 0.7):
      return 'C'
    case (s >= 0.6):
      return 'D'
    default:
      return 'F'
  }
}
-------------------------------------------------------------------------
var grader = sc =>{
  if (sc < 1 && sc >= 0.9) return "A";
  if (sc < 0.9 && sc >= 0.8) return "B";
  if (sc < 0.8 && sc >= 0.7) return "C";
  if (sc < 0.7 && sc >= 0.6) return "D";
  if (sc > 1 || sc < 0.6) return "F";
  return 'A';
  }
-------------------------------------------------------------------------
function grader(score) {
  if (score === 1) return "A";
  return ["D", "C", "B", "A"][Math.floor(score*10) - 6] || "F";
}
*/