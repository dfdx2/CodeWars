/* 8KYU CodeWars Even Or Odd

You will be given a table numbers, with one column number.

Return a dataset with two columns: number and is_even, where 
number contains the original input value, and is_even containing 
"Even" or "Odd" depending on number column values.

Numbers table schema
* number INT
Output table schema
* number  INT
* is_even STRING

*/
SELECT number,
CASE
  WHEN number % 2 = 0 THEN 'Even'
  WHEN number % 2 != 0 THEN 'Odd'
END AS is_even
FROM Numbers;
/*-------------------------------------------------------
--Write your SQL statement here--

-- SELECT Number and use CASE WHEN (condition) THEN RETURN
-- Condition : (number % 2) = 0 Then 'Even'
-- Else number does not return 0 = 'Odd' END AS is_even to create new column
-- From table 'numbers'

SELECT number, 
CASE WHEN (number % 2) = 0 THEN 'Even'
ELSE 'Odd' END AS is_even
FROM numbers;
---------------------------------------------------------
SELECT number,
CASE 
  WHEN number%2=0 THEN 'Even'
  ELSE 'Odd'
END is_even
FROM numbers;
---------------------------------------------------------
ALTER TABLE numbers
ADD COLUMN IF NOT EXISTS is_even VARCHAR(4);

UPDATE numbers SET is_even = 'Even' WHERE number%2 = 0;
UPDATE numbers SET is_even = 'Odd' WHERE number%2 != 0;

SELECT * FROM numbers;
---------------------------------------------------------
DROP TABLE IF EXISTS result;


CREATE TABLE result AS
SELECT
    number,
    CASE
        WHEN number % 2 = 0 THEN 'Even'
        ELSE 'Odd'
    END AS is_even
FROM
    numbers;


SELECT * FROM result;
---------------------------------------------------------
SELECT number,
  case 
    WHEN number % 2 = 0 THEN 'Even'
    ELSE 'Odd'
  END AS is_even
FROM numbers;
---------------------------------------------------------
SELECT number,
  CASE
    WHEN (number % 2) = 0 THEN 'Even'
    WHEN (number % 2) != 0  THEN 'Odd'
  END AS is_even
FROM numbers;
---------------------------------------------------------
select number,    CASE
           when number=0 then 'Even'
           WHEN mod(abs(number),2)= 0 THEN 'Even'
           WHEN mod(abs(number),2)= 1 THEN 'Odd'
           END is_even 
           from numbers

*/
