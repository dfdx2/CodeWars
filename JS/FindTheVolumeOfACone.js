/* 7KYU Find The Volume Of A Cone

Find the volume of a cone whose radius and height are provided 
as parameters to the function volume. Use the value of PI provided 
by your language (for example: Math.PI in JS, math.pi in Python or 
Math::PI in Ruby) and round down the volume to an Interger.

If you complete this kata and there are no issues, please remember 
to give it a ready vote and a difficulty rating. :)

*/

function volume(r,h) {
  return Math.floor((1/3) * Math.PI * (r*r) * h);
}
/*--------------------------------------------------
const volume = (r, h) => ~~(Math.PI * r * r * h / 3);
------------------------------------------------------
function volume(r,h) {
return Math.floor((Math.PI*r*r*h)/3)}
-----------------------------------------------------
const volume = (r, h) =>
  Math.PI * r ** 2 * h / 3 ^ 0;
----------------------------------------------------
function volume(r,h) {
  return Math.floor(Math.PI*r**2*h/3);
}
-----------------------------------------------------
const volume = (r,h) => Math.floor(h/3 * Math.PI * r ** 2);
---------------------------------------------------------
function volume(r,h) {
  let vol = (1/3) * Math.PI * r * r * h;
  return Math.floor(vol);
}
------------------------------------------------------------
const volume = (r, h) => Math.floor(Math.PI * h * r * r / 3); 

*/