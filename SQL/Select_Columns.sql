/* 8KYU CodeWars SQL Grasshopper: Select Columns

Greetings Grasshopper!
Using only SQL, write a query that returns all rows in the 
custid, custname, and custstate columns from the customers table.

Table Description for customers:
Column	Data Type	Size	Sample
custid	integer	8	4
custname	string	50	Anakin Skywalker
custstate	string	50	Tatooine
custard	string	50	R2-D2
Your solution should contain only SQL.

*/

SELECT custid, custname, custstate
FROM customers;

/*-----------------------------------------------------------
SELECT custid, custname, custstate FROM customers;
-------------------------------------------------------------
SELECT
  c.custid,
  c.custname,
  c.custstate
FROM customers c
-------------------------------------------------------------
SELECT 
  custid, 
  custname, 
  custstate
FROM 
  customers;
-------------------------------------------------------------
alter table customers drop column custard;
select * from customers-- Type your SQL here
---------------------------------------------------------------
CREATE VIEW CustomersView AS
    SELECT custid, custname, custstate
    FROM customers;
SELECT * FROM CustomersView;
---------------------------------------------------------------
SELECT x.custid, x.custname, x.custstate
FROM customers as x
*/