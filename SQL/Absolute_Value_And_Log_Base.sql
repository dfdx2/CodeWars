/* 7KYU CodeWars Easy SQL: Absolute Value and Log to Base

Given the following table 'decimals':

decimals table schema
id
number1
number2
Return a table with two columns (abs, log) where the values 
in abs are the absolute values of number1 and the values in 
log are values from number2 in logarithm to base 64.

*/
SELECT ABS(number1), LOG(64, number2)
FROM decimals;
/*-----------------------------------------------------------
select 
 abs(number1) abs,
 log(64, number2) log
from decimals
--------------------------------------------------------------
SELECT
  @NUMBER1 AS ABS,
  LOG(64.0, NUMBER2) AS LOG
FROM
  DECIMALS
-------------------------------------------------------------
SELECT 
  abs(number1) AS abs, log(64, number2) AS log
FROM
  decimals
--------------------------------------------------------------
select 
case 
when number1<0 then -number1
else number1
end as abs,
log(64,number2) as log
from decimals
--------------------------------------------------------------
SELECT @ number1 as abs,log(64,number2) as log FROM decimals
--------------------------------------------------------------
select 
Abs(d.number1) as "abs", 
Log(64, d.number2) as "log"
from decimals as d
---------------------------------------------------------------
CREATE TABLE IF NOT EXISTS decimals (
  id INTEGER,
  number1 FLOAT,
  number2 FLOAT
);

SELECT abs(number1) AS abs, log(64.0, number2) AS log
FROM decimals
;
---------------------------------------------------------------
SELECT 
  abs(d.number1) as "abs", 
  log(64, d.number2) as "log"
FROM decimals d
---------------------------------------------------------------
SELECT
  CASE WHEN number1 >= 0 THEN number1 ELSE number1 * -1 END AS "abs",
  CASE WHEN number2 > 0 THEN (log(64, number2))::numeric ELSE NULL END AS "log"
FROM
  decimals;
*/