/* 7KYU CodeWars Countries Capitals for Trivia Night

Your friends told you that if you keep coding on your 
computer, you are going to hurt your eyes. They suggested 
that you go with them to trivia night at the local club.

Once you arrive at the club, you realize the true motive 
behind your friends' invitation. They know that you are 
a computer nerd, and they want you to query the countries 
table and get the answers to the trivia questions.

Schema of the countries table:

country (String)
capital (String)
continent (String)
The first question: from the African countries that start 
with the character E, get the names of their capitals ordered 
alphabetically.

You should only give the names of the capitals. Any additional 
information is just noise
If you get more than 3, you will be kicked out, for being too 
smart
Also, this database is crowd-sourced, so sometimes Africa is 
written Africa and in other times Afrika.


*/

SELECT capital
FROM countries
WHERE continent LIKE 'Afri_a'
AND country LIKE 'E%'
ORDER BY capital ASC
LIMIT 3;

/*------------------------------------------------------------------
SELECT capital
FROM countries
WHERE SUBSTR(country,1,1)='E' 
  AND continent IN ('Africa', 'Afrika')
ORDER BY capital  
LIMIT 3
;
--------------------------------------------------------------------
SELECT
  CAPITAL
FROM COUNTRIES
WHERE UPPER(CONTINENT) SIMILAR TO 'AFRI(C|K)A'
  AND COUNTRY ILIKE 'E%'
ORDER BY CAPITAL
LIMIT 3
--------------------------------------------------------------------
SELECT capital FROM countries WHERE
UPPER(continent) IN ('AFRICA', 'AFRIKA') AND
UPPER(country) LIKE 'E%'
ORDER BY capital ASC
LIMIT 3;
--------------------------------------------------------------------
SELECT capital FROM (
   SELECT SUBSTRING(country, 1, 1) AS letra, *
      FROM countries
     WHERE continent = 'Africa'
        OR continent = 'Afrika'
  ORDER BY letra
 ) AS padrao
 WHERE letra = 'E'
 ORDER BY capital
 LIMIT 3;
--------------------------------------------------------------------
SELECT
  capital
FROM
  countries
WHERE
  country ~ '^E.*'
ORDER BY
  capital
LIMIT
  3
--------------------------------------------------------------------
SELECT capital
FROM countries
WHERE continent LIKE 'A_____' AND country LIKE 'E%'
ORDER BY capital 
LIMIT 3
*/