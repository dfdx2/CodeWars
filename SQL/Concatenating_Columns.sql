/* 7KYU CodeWars SQL: Concatenating Columns

Given the table below:

** names table schema **

id
prefix
first
last
suffix

Your task is to use a select statement to return a single column 
table containing the full title of the person (concatenate all 
columns together except id), as follows:

** output table schema **

title
Don't forget to add spaces.


*/

SELECT CONCAT(prefix, ' ', first, ' ', last, ' ', suffix) AS title
FROM names;

/*---------------------------------------------------------------------
SELECT concat_ws(' ', prefix,first,last,suffix) AS title FROM names;
-----------------------------------------------------------------------
SELECT format('%s %s %s %s', prefix, first, last, suffix) AS title
  FROM names
-----------------------------------------------------------------------
SELECT prefix || ' ' || first || ' ' || last || ' ' || suffix AS title  FROM names
-----------------------------------------------------------------------
SELECT
    FORMAT('%s %s %s %s',
           prefix,
           first,
           last,
           suffix) AS title
FROM
    names
-----------------------------------------------------------------------
select
  array_to_string(array[prefix,first,last,suffix],' ') as title
from
  names
  
*/