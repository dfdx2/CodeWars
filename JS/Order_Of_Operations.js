/* 8KYU CodeWars Grasshopper - Order of operations

You are running the calculation 2 + 2 * 2 + 2 * 2 and 
expect to get the answer 32 but instead the function 
keeps returning 10. Fix the function to make it return 
32 without changing the number or the operators.

*/
function orderOperations () {
  return (2 + 2) * (2 + 2) * 2
}
/*-------------------------------
const orderOperations = () => (2 + 2) * (2 + 2) * 2
---------------------------------
let orderOperations = () => (2+2)*(2+2)*2;
---------------------------------
function orderOperations () {
  return (2 + 2) * (2 + 2) * 2
}
---------------------------------
const orderOperations = () => (2 + 2) * (2 + 2) * 2;
---------------------------------
const orderOperations = () => '+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*'.length;
---------------------------------
function orderOperations () {
  return -~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~2 + 2 * 2 + 2 * 2
}
---------------------------------
function orderOperations () {
  return (2 + 2 * 2) + (2 * 2 + 2) * 2 * 2 + 2
}
---------------------------------
function orderOperations () {
  return (2 + 2 * 2 + 2) * 2**2
}
---------------------------------
orderOperations=ᒿ=>22+2*2+2*2+2
*/