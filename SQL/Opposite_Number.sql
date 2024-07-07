/* 7KYU CodeWars Opposite Number

Very simple, given a number (integer / decimal / both depending on the language), 
find its opposite (additive inverse).

Examples:

1: -1
14: -14
-34: 34
You will be given a table: opposite, with a column: number. 

Return a table with a column: res.

*/
-- You will be given a table: "opposite", with a column: "number". Return a table with a column: "res".
SELECT (number * -1) AS res FROM opposite

/*--------------------------------------------------------------
Select -number AS res FROM opposite;
----------------------------------------------------------------
SELECT
  NUMBER * (-1) AS res
FROM OPPOSITE
----------------------------------------------------------------
select  case when number =0 then 0
else -1*number end as res 
from opposite 
----------------------------------------------------------------
ALTER TABLE opposite ADD COLUMN res INT;

UPDATE opposite SET res = (number * -1);

SELECT res
FROM opposite;

----------------------------------------------------------------
SELECT (CASE
           WHEN number > 0 OR number < 0 THEN -number
           WHEN number = 0 THEN number
        END) AS res
FROM opposite;
----------------------------------------------------------------
select o.number * -1 as res  from opposite o;
----------------------------------------------------------------
SELECT 100-(100+number) res FROM opposite
----------------------------------------------------------------

SELECT CASE 
        WHEN SIGN(opposite.number) = 1 THEN -ABS(opposite.number)
        ELSE ABS(opposite.number) 
        END AS res
FROM opposite 
------------------------------------------------------------------
SELECT number/-1 AS res FROM opposite;
*/