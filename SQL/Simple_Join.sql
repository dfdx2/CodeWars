/* 7KYU CodeWars SQL Basics: Simple Join

For this challenge you need to create a simple SELECT statement 
that will return all columns from the products table, and join to 
the companies table so that you can return the company name.

products table schema
id
name
isbn
company_id
price
companies table schema
id
name
You should return all product fields as well as the company name as "company_name".

*/

SELECT products.id, products.name, products.isbn, products.company_id, products.price, companies.name AS company_name
FROM products
LEFT JOIN companies ON products.company_id = companies.id;

/*------------------------------------------------------------------------------------
SELECT products.*, companies.name AS company_name
FROM products JOIN companies ON company_id = companies.id
--------------------------------------------------------------------------------------
SELECT p.*,
       c.name AS company_name
  FROM products p,
       companies c
 WHERE c.id = p.company_id
--------------------------------------------------------------------------------------
SELECT 
  products.id,
  products.name,
  products.isbn,
  products.company_id,
  products.price,
  companies.name as company_name
FROM
  products
JOIN
  companies on companies.id = products.company_id
--------------------------------------------------------------------------------------
select p.*, c.name company_name
FROM products p
JOIN companies c ON c.id=p.company_id
--------------------------------------------------------------------------------------
SELECT
  P.id,
  P.name,
  P.isbn,
  P.company_id,
  P.price,
  C.name AS company_name
FROM products AS P
INNER JOIN companies AS C
  ON P.company_id = C.id
--------------------------------------------------------------------------------------
-- Create your SELECT statement here
SELECT products.*, companies.name as company_name FROM products
JOIN companies ON products.company_id = companies.id
*/