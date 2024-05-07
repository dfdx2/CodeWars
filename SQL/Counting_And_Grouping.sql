/* 7KYU CodeWars Counting and Grouping

Given a demographics table in the following format:

** demographics table schema **

id
name
birthday
race
you need to return a table that shows a count of each race represented, 
ordered by the count in descending order as:

** output table schema **

race
count

*/

SELECT race, COUNT(race) AS count
FROM demographics
GROUP BY race
ORDER BY count DESC;

/*------------------------------------------------------
SELECT race, COUNT(race)
FROM demographics
GROUP BY race
ORDER BY Count(race) desc
--------------------------------------------------------
SELECT
  RACE,
  COUNT(1) AS COUNT
FROM
  DEMOGRAPHICS
GROUP BY
  RACE
ORDER BY
  COUNT DESC
--------------------------------------------------------
SELECT race,COUNT(*) FROM demographics GROUP BY race ORDER BY count DESC;
--------------------------------------------------------
SELECT
  Race,
  COUNT(*) AS Count
FROM
  Demographics
GROUP BY
  Race
ORDER BY
  2 DESC
-------------------------------------------------------
SELECT race, COUNT(*)
FROM demographics
GROUP BY race
ORDER BY 2 DESC;
--------------------------------------------------------
select count(race) count, race from demographics group by race order by count desc
--------------------------------------------------------
select race, count(*) from demographics group by race order by count desc
*/