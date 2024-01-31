/* 8KYU CodeWars SQL Basics : Simple SUM

For this challenge you need to create a simple SUM statement that will sum all the ages.

people table schema
id
name
age
select table schema
age_sum (sum of ages)
NOTE: Your solution should use pure SQL. Ruby is used within the test cases to do the actual testing.

NOTE2: You need to use ALIAS for creating age_sum

*/

SELECT SUM(age) as age_sum
FROM people;
/*----------------------------------------------------
SELECT
  SUM(age) age_sum
FROM
  people
------------------------------------------------------
select sum(age) as age_sum from people
-------------------------------------------------------
SELECT SUM(p.age) age_sum
FROM people p
-- Create your SELECT statement here
------------------------------------------------------
SELECT SUM(t.age) age_sum
FROM people t
-------------------------------------------------------
alter table people
add age_sum int ;
select  sum (age) age_sum from people
--------------------------------------------------------
select
  sum(age) as age_sum
from people
--------------------------------------------------------
select sum(all age) as age_sum from people
*/