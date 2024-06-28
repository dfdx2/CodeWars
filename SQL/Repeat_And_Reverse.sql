/* 7KYU CodeWars SQL Basics: Repeat and Reverse

Using our monsters table with the following schema:

monsters table schema

id
name
legs
arms
characteristics
return the following table:

** output schema**

name
characteristics
Where the name is the original string repeated three times 
(do not add any spaces), and the characteristics are the 
original strings in reverse (e.g. 'abc, def, ghi' becomes
'ihg ,fed ,cba').

*/

SELECT REPEAT(name, 3) AS name, REVERSE(characteristics) AS characteristics
FROM monsters;

/*---------------------------------------------------------------------
SELECT REPEAT(name, 3) AS name, REVERSE(characteristics) AS characteristics FROM monsters
-----------------------------------------------------------------------
SELECT 
 REPEAT(name,3) as name,
 REVERSE(characteristics) as characteristics
FROM
 MONSTERS;
-----------------------------------------------------------------------
SELECT (name || name || name) as name, REVERSE(characteristics) as characteristics
FROM monsters
-----------------------------------------------------------------------
SELECT concat(name, name, name) as name, Reverse(characteristics) as characteristics FROM monsters;
------------------------------------------------------------------------
UPDATE monsters
SET name = CONCAT(name, name, name);

UPDATE monsters
SET characteristics = REVERSE(characteristics);

SELECT name, characteristics FROM monsters;
------------------------------------------------------------------------
Select name || name || name as name,
REVERSE(characteristics) as characteristics
FROM monsters
-----------------------------------------------------------------------
Select 
Concat(m.name, m.name, m.name)  as name,
reverse(m.characteristics) as characteristics
From monsters as m
*/