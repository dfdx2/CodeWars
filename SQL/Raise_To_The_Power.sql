/* 7KYU CodeWars SQL Basics: Raise To The Power

Given the following table 'decimals':

decimals table schema
id
number1
number2
Return a table with a single column result which is the 
output of number1 raised to the power of number2.

*/

SELECT POWER(number1, number2) AS result
FROM decimals;

/*----------------------------------------------------
select pow(number1, number2) as result
from decimals;
------------------------------------------------------
SELECT power(number1,number2) as result FROM decimals
------------------------------------------------------
SELECT
  POW(NUMBER1, NUMBER2) AS RESULT
FROM
  DECIMALS
------------------------------------------------------
SELECT
  number1 ^ number2 AS Result
FROM
  decimals
------------------------------------------------------
DROP TABLE IF EXISTS TABLE_RESULT38530;
CREATE TABLE TABLE_RESULT38530 (result DOUBLE PRECISION);
INSERT INTO TABLE_RESULT38530 (result) SELECT POWER(number1, number2) FROM decimals;
SELECT * FROM TABLE_RESULT38530;
------------------------------------------------------
SELECT POWER (number1::float, number2) AS result FROM decimals 
------------------------------------------------------
select 
CASE 
WHEN number1=0 and number2 < 0 Then 0
ELSE power(number1,number2) 
END
as result from decimals
*/