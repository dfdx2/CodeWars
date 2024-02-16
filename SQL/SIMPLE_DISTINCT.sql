/* 8KYU CodeWars SQL Basics: Simple DISTINCT

For this challenge you need to create a simple 
DISTINCT statement, you want to find all the 
unique ages.

people table schema

id
name
age
select table schema
age (distinct)

*/

SELECT DISTINCT age
FROM people;
/*---------------------------------------------------
select distinct age from people
----------------------------------------------------
Select Distinct
p.age
From
people p;
----------------------------------------------------
SELECT DISTINCT(people.age) as age
FROM people
WHERE people.name!='George Bush'
LIMIT 69;
-----------------------------------------------------
Select DISTINCT(age) from people
*/