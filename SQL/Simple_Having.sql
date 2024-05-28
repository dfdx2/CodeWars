/* 7KYU CodeWars SQL Basics: Simple Having

For this challenge you need to create a simple HAVING 
statement, you want to count how many people have the 
same age and return the groups with 10 or more people 
who have that age.

people table schema

id
name
age

return table schema

age
total_people

NOTE: Your solution should use pure SQL. Ruby is used 
within the test cases to do the actual testing.

*/
SELECT age, COUNT(*) AS total_people
FROM people
GROUP BY age
HAVING COUNT(*) >= 10;

/*----------------------------------------------------------
SELECT age, COUNT(*) AS total_people FROM people GROUP BY age HAVING COUNT(*) >= 10;
------------------------------------------------------------
SELECT age AS age,
  count(id) AS total_people
FROM people
GROUP BY age
HAVING count(id) >= 10;
------------------------------------------------------------
SELECT 
  COUNT(1) AS total_people
  ,age 
FROM people 
GROUP BY age
HAVING count(1) > 9
------------------------------------------------------------
SELECT p.age, COUNT(p.age) AS total_people
FROM people p
GROUP BY p.age
HAVING COUNT(p.age) >= 10
------------------------------------------------------------
SELECT
  age,
  COUNT(age) AS total_people
FROM
  people
GROUP BY
  age
HAVING
  COUNT(age) >= 10
------------------------------------------------------------
SELECT age, COUNT(age) as total_people
  FROM people
    GROUP BY age
      HAVING COUNT(age) >= 10;
------------------------------------------------------------

*/