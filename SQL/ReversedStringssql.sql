/* 8KYU CodeWars Reversed Strings sql

Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'

write your SQL statement here: you are given a table 'solution' with 
column 'str', return a table with column 'str' and your result in a 
column named 'res'.

*/
SELECT str, REVERSE(str) AS res
FROM solution;