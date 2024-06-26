/* 8KYU CodeWars Days in the year

A variation of determining leap years, assuming only integers are used and years can be negative and positive.

Write a function which will return the days in the year and the year entered in a string. For example:

yearDays(2000) returns "2000 has 366 days"
There are a few assumptions we will accept the year 0, even though there is no year 0 in the Gregorian Calendar.

Also the basic rule for validating a leap year are as follows

Most years that can be divided evenly by 4 are leap years.

Exception: Century years are NOT leap years UNLESS they can be evenly divided by 400.

So the years 0, -64 and 2016 will return 366 days. Whilst 1974, -10 and 666 will return 365 days.




*/

function yearDays(year) {
  return year % 100 != 0 && year % 4 == 0 || year % 400 == 0 ? year + " has 366 days" : year + " has 365 days";
}
/*------------------------------------------------------------
function yearDays(year) {
  return year + ' has ' + (!(year % 100) && year % 400 || year % 4 ? '365' : '366') + ' days';
}
--------------------------------------------------------------
function yearDays(year) {
  let nDays =  year % 4 ? 365 :
               year % 100 ? 366:
               year % 400 ? 365 : 366;
  
  return `${year} has ${nDays} days`;
}
--------------------------------------------------------------
function yearDays(year)
{
  var result = 365;
  if (year%400==0 || (year%4==0 && year%100!==0)) {
    result = 366;
  }
  
  return year + ' has ' + result + ' days';
}
--------------------------------------------------------------
function yearDays(year)
{ //evenly divisible by 4 = a leap year.
  if(year % 400 === 0) {
    return year + ' has 366 days';
  }
  else if(year % 4 === 0 && year % 100 !== 0) { //centuries 
    return year + ' has 366 days';
  }
  else {
    return year + ' has 365 days'; 
  }
}
--------------------------------------------------------------
function yearDays (year) {
  const isCentury = year % 100 === 0;
  const isLeap = year % (isCentury ? 400 : 4) === 0;
  const days = isLeap ? 366 : 365;
  return `${year} has ${days} days`;
}
--------------------------------------------------------------
const yearDays = (year) => {
  const date = new Date(year, 2, 0)
  if (year === 0) {
    return `${year} has 366 days`
  }
  if (date.getDate() == 29) {
    return `${year} has 366 days`
  }
  return `${year} has 365 days`
}
------------------------------------------------------------
const yearDays = year =>
  `${year} has 36${6 - !!(year % 400 && !(year % 100) || year % 4)} days`;
*/