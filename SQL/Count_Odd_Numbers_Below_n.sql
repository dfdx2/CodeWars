/* 8KYU CodeWars Count Odd Numbers Below n

Given a number n, return the number of positive odd numbers below n, EASY!

Examples (Input -> Output)
7  -> 3 (because odd numbers below 7 are [1, 3, 5])
15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
Expect large Inputs!

*/
-- # write your SQL statement here: you are given a table 'oddcount' with column 'n', return a table with column 'n' and your result in a column named 'res'.
SELECT n, n / 2 AS res
FROM oddcount;
/*------------------------------------------------------------------
select n, cast(n/2 as bigint) as res
from oddcount;
--------------------------------------------------------------------
select n, n/2::int as res
from oddcount
--------------------------------------------------------------------
select n, n >> 1 as res
from oddcount
--------------------------------------------------------------------
-- # write your SQL statement here: you are given a table 'oddcount' with column 'n', 
--return a table with column 'n' and your result in a column named 'res'.
CREATE OR REPLACE FUNCTION count_odd(num bigint) RETURNS bigint AS $$
  DECLARE 
--     start_index bigint := 1;
--     max_num bigint := num - 1;
--     odd_count bigint := 0;
  BEGIN
--       WHILE start_index < max_num 
--       LOOP
--           odd_count = odd_count + 1;
--           start_index = start_index + 2;
--       END LOOP;
--       RETURN odd_count;
      RETURN num/2;
  
  END;

$$ language plpgsql;

SELECT n, count_odd(n) as res FROM oddcount;
--------------------------------------------------------------------
SELECT n, FLOOR(n/2) :: BIGINT res
FROM oddcount
--------------------------------------------------------------------
select n,(n/2+1)-1as res from oddcount
--------------------------------------------------------------------
select n, n >> 1 as res from oddcount
--------------------------------------------------------------------
select n,
       (case
        when (n-1) % 2 = 0 then (n-1)/2
        else ((n-1)/2) + 1
      end) as res
from oddcount;
--------------------------------------------------------------------
select n ,case when n <2 then 0
               when n%2 = 0 then n/2
               else (n-1)/2 end as res
from oddcount
--------------------------------------------------------------------
SELECT
  n,
  CASE
    WHEN n%2 = 0 THEN (n+1)/2
    ELSE (n)/2
  END AS res
FROM
  oddcount;
--------------------------------------------------------------------
SELECT n,
       CAST(FLOOR(n / 2) AS BIGINT) AS res
FROM oddcount;
--------------------------------------------------------------------
SELECT
  N,
  N/2 AS res
FROM oddcount
WHERE N >= 0
*/