/* 8KYU CodeWars Easy Sql - Lower Case

Given a demographics table in the following format:

** demographics table schema **

id
name
birthday
race
you need to return the same table where all letters are lowercase in the race column.


*/

SELECT id, name, birthday, LOWER(race) AS race
FROM demographics;

/*--------------------------------------------------------------------------------------
SELECT *, lower(race) AS race
FROM demographics
----------------------------------------------------------------------------------------
select 
  id,
  name,
  birthday birthday,
  lower(race) as race
from demographics;
----------------------------------------------------------------------------------------
SELECT 
demographics.id, 
demographics.name, 
demographics.birthday, 
LOWER(demographics.race) AS race
FROM demographics
----------------------------------------------------------------------------------------
UPDATE demographics SET race = LOWER(race);
SELECT * FROM demographics ;
----------------------------------------------------------------------------------------
SELECT t.id,
       t.name,
       t.birthday,
       LOWER(t.race) AS race
FROM demographics t;
----------------------------------------------------------------------------------------
SELECT d.id, d.name, d.birthday,
LOWER(race) as race
FROM demographics AS d
*/