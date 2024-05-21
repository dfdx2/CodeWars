/* 7KYU CodeWars SQL: Disorder

You are given a table numbers with just one column, number. 
It holds some numbers that are already ordered.

You need to write a query that makes them un-ordered, as in, 
every possible ordering should appear equally often.

*/

SELECT *
FROM numbers
ORDER BY random();

/*------------------------------------------------------
SELECT * FROM numbers ORDER BY RANDOM()*(1000-1)+1
--------------------------------------------------------
SELECT n.number FROM numbers n ORDER BY RANDOM()
--------------------------------------------------------
 SELECT number 
  FROM (
    SELECT number, random() as "rand"
    FROM numbers
    ORDER BY rand) AS num;
--------------------------------------------------------
select number, random() as alea from numbers order by alea
--------------------------------------------------------
select 
  "number"
from (
  select 
    *
    , random()
  from numbers
) as tbl
order by "random"
--------------------------------------------------------
SELECT number FROM numbers
ORDER BY random() * 100;
*/