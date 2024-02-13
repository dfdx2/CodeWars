/* 7KYU CodeWars SQL Basics: Simple Group By

For this challenge you need to create a simple 
GROUP BY statement, you want to group all the 
people by their age and count the people who 
have the same age.

people table schema

id
name
age

select table schema

age [group by]
people_count (people count)

*/
SELECT age, COUNT(age) AS people_count
FROM people
GROUP BY age;

/*------------------------------------------------
SELECT
  age,
  COUNT(*) people_count
FROM
  people
GROUP BY
  age
---------------------------------------------------
SELECT A.age, count(A.id) as people_count FROM 
people A
GROUP BY A.age
----------------------------------------------------
SELECT age, count(*) people_count FROM people GROUP BY age
---------------------------------------------------
SELECT age, COUNT(*) AS people_count
FROM people p
GROUP BY p.age
----------------------------------------------------
select age, count(name) as people_count
from people
group by 1
----------------------------------------------------
SELECT age, count('id') people_count FROM people GROUP BY age
--------------------------------------------------
SELECT age, COUNT(people.name) AS people_count
FROM people
GROUP BY age;
----------------------------------------------------
Select age,count(name) as People_count
from people
group by age
---------------------------------------------------
SELECT pe.age, 
COUNT (*) as people_count
FROM people pe
GROUP BY age;
*/