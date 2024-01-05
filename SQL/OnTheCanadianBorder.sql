/* 8KYU CodeWars On The Canadian Border

You are a border guard sitting on the Canadian border. You were given a list of travelers who have arrived at your gate today. You know that American, Mexican, and Canadian citizens don't need visas, so they can just continue their trips. You don't need to check their passports for visas! You only need to check the passports of citizens of all other countries!

Select names, and countries of origin of all the travelers, excluding anyone from Canada, Mexico, or The US.

travelers table schema

name
country
NOTE: The United States is written as 'USA' in the table.

NOTE: Your solution should use pure SQL. Ruby is used within the test cases just to validate your answer.

*/
SELECT *
FROM travelers
WHERE NOT country IN ('USA', 'Canada', 'Mexico');
/*-------------------------------------------------------------------
SELECT name ,country
  FROM travelers
  WHERE country IS NULL
    OR country NOT IN ('Canada' ,'Mexico' ,'USA')
---------------------------------------------------------------------
SELECT * FROM travelers
WHERE country != 'Canada'
AND country != 'Mexico'
AND country != 'USA';
---------------------------------------------------------------------
SELECT travelers.name, travelers.country
FROM travelers
WHERE LOWER(travelers.country) not in ('usa', 'mexico', 'canada')
----------------------------------------------------------------------
SELECT
  name,
  country
FROM travelers 
WHERE country <> ALL(ARRAY['Mexico','Canada','USA']);
----------------------------------------------------------------------
SELECT * FROM travelers WHERE (country != 'Canada' and country != 'Mexico' and country != 'USA')

*/