/* 7KYU CodeWars SQL: RIGHT AND LEFT

You are given a table named repositories, format as below:

** repositories table schema **

project
commits
contributors
address

The table shows project names of major cryptocurrencies, their 
numbers of commits and contributors and also a random donation 
address ( not linked in any way :) ).

For each row: Return first x characters of the project name 
where x = commits. Return last y characters of each address 
where y = contributors.

Return project and address columns only, as follows:

** output table schema **

project
address
Case should be maintained.

*/

SELECT LEFT(project, commits) as project, RIGHT(address, contributors) as address 
FROM repositories;

/*---------------------------------------------------------------------
SELECT SUBSTRING(project, 0, commits+1) AS project
    ,SUBSTRING(address, LENGTH(address) - contributors + 1) AS address
  FROM repositories
-----------------------------------------------------------------------
SELECT 
  substring(project, 1, commits) AS project,
  reverse(substring(reverse(address), 1, contributors)) AS address
FROM repositories;
-----------------------------------------------------------------------
SELECT 
  SUBSTRING(project, 1, commits) AS project, 
  SUBSTRING(address, (LENGTH(address) - contributors) + 1, contributors) AS address
FROM repositories
-----------------------------------------------------------------------
select
LEFT(a.project, a.commits) as project,
RIGHT(a.address, a.contributors) as address
from repositories a
-----------------------------------------------------------------------
select
left(r.project, r.commits::int) as project,
right(r.address, r.contributors::int) as address
from repositories r;
-----------------------------------------------------------------------
SELECT SUBSTRING(project,1,commits) AS project, 
CASE
WHEN contributors = 0 THEN ''
WHEN contributors <> 0 THEN RIGHT(address, contributors)
END AS address
FROM repositories
-----------------------------------------------------------------------
UPDATE repositories 
SET project=LEFT(project,commits), address=RIGHT(address,contributors);

SELECT project, address FROM repositories;
*/