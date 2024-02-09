/* 8KYU CodeWars SQL Basics: Mod

Given the following table 'decimals':
** decimals table schema **

id
number1
number2
Return a table with one column (mod) which is the output of 
number1 modulus number2.

*/

SELECT MOD(number1, number2) AS mod
FROM decimals;

/*-----------------------------------------------------
select
  mod(number1, number2) as mod
from decimals
--------------------------------------------------------
SELECT
  NUMBER1 % NUMBER2 AS MOD
FROM
  DECIMALS
---------------------------------------------------------
SELECT MOD(number1, number2)
FROM decimals
---------------------------------------------------------
SELECT number1%number2 AS mod FROM decimals
--------------------------------------------------------
SELECT MOD(number1, number2) AS mod
FROM decimals;
---------------------------------------------------------
SELECT (number1 % number2) As mod FROM decimals;
---------------------------------------------------------
SELECT number1 % number2 mod FROM decimals;

*/