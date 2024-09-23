/* 8KYU CodeWars Simple Mulitplication

This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.


*/
SELECT number, 
CASE
WHEN number % 2 = 0 THEN number * 8
ELSE number * 9
END AS res
FROM multiplication;

/*-----------------------------------------------------------------------------
SELECT number,
CASE
    WHEN number%2=0 THEN number*8
    ELSE number*9
  END 
  AS res
  FROM multiplication
-------------------------------------------------------------------------------
SELECT number, number * 
      (CASE WHEN MOD(number, 2) = 1 THEN 9 ELSE 8 END) AS res 
FROM multiplication
-------------------------------------------------------------------------------
SELECT number,
  CASE number % 2
    WHEN 1 THEN number * 9
    ELSE number * 8
  END as res
 FROM multiplication;
-------------------------------------------------------------------------------
SELECT number, 
       CASE 
         WHEN number % 2 = 0 THEN number * 8 
         ELSE number * 9 
       END AS res 
FROM   multiplication;

-------------------------------------------------------------------------------
SELECT number,
  CASE WHEN number %2=0 THEN number*8 ELSE number*9 END AS res
 FROM multiplication
-------------------------------------------------------------------------------
SELECT m.number,
       m.number * (8 + (m.number % 2)) AS res
  FROM multiplication m
*/