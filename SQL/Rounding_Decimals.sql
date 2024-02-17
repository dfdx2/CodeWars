/* 8KYU CodeWars EASY SQL: Rounding Decimals

Given the following table 'decimals':

** decimals table schema **

id
number1
number2
Return a table with two columns (number1, number2), 
the value in number1 should be rounded down and the 
value in number2 should be rounded up.

*/

SELECT FLOOR(number1) AS number1, CEIL(number2) AS number2
FROM decimals;

/*------------------------------------------------------
SELECT FLOOR(number1) AS number1, CEIL(number2) AS number2 from decimals
--------------------------------------------------------
SELECT ROUND(number1-0.499) AS number1, ROUND(number2+0.499) AS number2 FROM decimals;
---------------------------------------------------------
UPDATE decimals
SET number1 = FLOOR(number1),
  number2 = CEIL(number2);
SELECT number1, number2 FROM decimals;
---------------------------------------------------------
UPDATE decimals SET number1=round(number1) WHERE round(number1) != number1;
UPDATE decimals SET number2=round(number2) WHERE round(number2) != number2;

SELECT number1,number2  FROM decimals;
*/