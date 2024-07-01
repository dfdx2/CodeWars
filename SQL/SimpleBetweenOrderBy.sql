/*  BETA CodeWars SQL Basics: Simple BETWEEN and ORDER BY

You are given a table of persons which includes their respective age. 
Your task is to return the list of people, age 30 through 50, using 
the BETWEEN keyword.

The schema for the persons table is as follows:

id
name
age

The resulting table should have two columns as follows:

name
age

Order by age, highest to lowest.

*/

SELECT name, age
FROM persons
WHERE age BETWEEN 30 AND 50
ORDER BY age DESC;

/*----------------------------------------------------------
SELECT persons.name, persons.age FROM persons 
  WHERE persons.age BETWEEN 30 AND 50
  ORDER BY age DESC;
------------------------------------------------------------
SELECT name, age
From persons
Where age between 30 and 50
Order by age DESC
------------------------------------------------------------
Select p.name,p.age
From persons p
Where p.age between 30 and 50
Order by p.age DESC
-----------------------------------------------------------
select name,age from persons where age between 30 and 51 order by age desc
------------------------------------------------------------
SELECT p.name, p.age FROM persons p WHERE age BETWEEN 30 AND 50 ORDER BY age DESC
------------------------------------------------------------
SELECT t.name,
       t.age
FROM persons t
WHERE t.age BETWEEN 30 AND 50
ORDER BY t.age DESC;
-----------------------------------------------------------
select
  p.name,
  p.age
from
  persons p
where
  p.age between 30 and 50
order by
  p.age desc
------------------------------------------------------------
SELECT name, age FROM persons where age BETWEEN 30 AND 50 ORDER BY age DESC ;

*/
