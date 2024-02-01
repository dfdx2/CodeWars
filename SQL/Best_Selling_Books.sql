/* 7KYU CodeWars Best Selling Books SQL for Beginners # 5

You work at a book store. It's the end of the month, and you 
need to find out the 5 bestselling books at your store. Use a 
select statement to list names, authors, and number of copies 
sold of the 5 books which were sold most.

books table schema

name
author
copies_sold

*/

SELECT *
FROM books
ORDER BY copies_sold DESC LIMIT 5;

/*-------------------------------------
SELECT books.name, 
       books.author, 
       books.copies_sold
FROM books
ORDER BY books.copies_sold DESC
LIMIT 5; 
----------------------------------------
SELECT 
   name,
   author,
   sum(copies_sold) as copies_sold
FROM 
   books
GROUP BY 
   name,author
ORDER BY
	SUM (copies_sold) DESC
LIMIT 5
----------------------------------------
SELECT
  name
  ,author
  ,copies_sold
FROM(
      SELECT 
          name
          ,author
          ,copies_sold
          ,ROW_NUMBER() OVER (PARTITION BY 1 ORDER BY copies_sold DESC) AS RN
      FROM books
    ) VS
WHERE RN <= 5
----------------------------------------
SELECT A.NAME, A.AUTHOR, A.COPIES_SOLD FROM BOOKS A ORDER BY COPIES_SOLD DESC limit 5 
-----------------------------------------
SELECT t.name,
       t.author,
       t.copies_sold
FROM books t
ORDER BY copies_sold DESC
LIMIT 5;
------------------------------------------
SELECT name, author, copies_sold
FROM books
WHERE name IN (SELECT name 
               FROM(SELECT name, copies_sold
                  FROM books
                  ORDER BY copies_sold DESC
              LIMIT 5)sub)
--------------------------------------------
select b.name,b.author,b.copies_sold from books b where copies_sold > 2000
*/