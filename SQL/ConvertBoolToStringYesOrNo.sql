-- 8KYU CodeWars Convert boolean value to strings 'Yes' or 'No'
-- # write your SQL statement here: you are given a table 'booltoword' with column 'bool', return a table with column 'bool' and your result in a column named 'res'.
SELECT bool,
CASE 
  WHEN bool = 'true' THEN 'Yes'
  WHEN bool = 'false' THEN 'No'
END AS res
FROM booltoword;  

/*------------------------------------------------------------
SELECT bool, 
       CASE 
           WHEN bool THEN 'Yes'
           ELSE           'No' 
       END AS res 
FROM booltoword
--------------------------------------------------------------
SELECT bool, CASE WHEN bool THEN 'Yes' ELSE 'No' END AS res FROM booltoword
--------------------------------------------------------------
SELECT bool, 
       case when bool='true' then 'Yes' when bool='false' then 'No' END as res
FROM booltoword;

--------------------------------------------------------------
select b.bool,
       case 
         when b.bool= true then 
          'Yes'
       else 
         'No'
       end  res
from booltoword b
--------------------------------------------------------------
select bool,
replace (
         replace (bool , 0, 'No'),
        1,'Yes') res
   from booltoword
--------------------------------------------------------------
select bool, 
CASE
  WHEN (bool) THEN 'Yes' 
  ELSE 'No'
END
as res
from booltoword
*/