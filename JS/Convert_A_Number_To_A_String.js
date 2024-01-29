/* 8KYU CodeWars Convert A Number To A String JS

We need a function that can transform a number (integer) into a string.

What ways of achieving this do you know?

Examples (input --> output):
123  --> "123"
999  --> "999"
-100 --> "-100"

*/
function numberToString(num) {
    return num.toString();
  }
/*-----------------------------------------------------------
function numberToString(num) {
  return ''+num;
}
-------------------------------------------------------------
const numberToString = num => `${num}`;
-------------------------------------------------------------
const numberToString = num => num.toString();
-------------------------------------------------------------
function numberToString(num) {
  // Return a string of the number here!
  return `${num}`;
}
--------------------------------------------------------------
function numberToString(num) {
  // could just do: return num + ''; But THAT would be cheating
  var str = '',
      mult = num < 0 ? -1 : 1;
  num *= mult;

  do {
    str = String.fromCharCode(num % 10 + 48) + str;
    num = ~~(num / 10);
  } while (num > 0);
  
  if(mult < 0) str = "-" + str;
  return str;
}
---------------------------------------------------------------
const numberToString = num => String(num)
-------------------------------------------------------------
function numberToString(num) {
  rnd = Math.random();
  if (rnd < .01){
    return 'got unlucky and did\'nt pass the tests';
  } else if (rnd < .333){
    return numberToString1(num);
  } else if (rnd < .666){
    return numberToString2(num);
  } else {
    return numberToString3(num);
  }
}

function numberToString1(num) {
  return '' + num;
}

function numberToString2(num) {
  return String(num); 
}

function numberToString3(num) {
  return num.toString();
}
---------------------------------------------------------------
function numberToString(num) {
  
  if (typeof num === 'string')
    return new RegExp('^[0-9.e]+$').test(num) ? num : 'Invalid number.';
  else if (typeof num === 'number')
    return num.toString(10);
  else
    return "Invalid number."
}
----------------------------------------------------------------
function numberToString(num) {
  var x = num;
  var y = JSON.stringify(x);
  return y;
}

*/
