/* 7KYU CodeWars Hello SQL World!

Hello SQL!

Return a table with a single column named Greeting with the phrase 'hello world!'

Please use Data Manipulation Language and not Data Definition 
Language to solve this Kata

*/

-- write your select statement to return hello world
CREATE TABLE Hi (
  Greeting varchar(255)
);
INSERT INTO Hi(Greeting)
VALUES('hello world!');

SELECT 'hello world!' AS "Greeting"

/*--------------------------------------------------------
CREATE TABLE tbl(Greeting text);
INSERT INTO tbl values("hello world!");
SELECT * FROM tbl;
----------------------------------------------------------
CREATE TABLE words
(
Greeting varchar(255)
);

INSERT INTO words (Greeting) VALUES ('hello world!');

SELECT * FROM words;
----------------------------------------------------------
CREATE TABLE codewars (
  Greeting varchar(50) NOT NULL
);

INSERT INTO codewars VALUES ('hello world!');
SELECT * FROM codewars WHERE Greeting = 'hello world!';
----------------------------------------------------------
SELECT * FROM (VALUES ('hello world!') ) as t("Greeting")
----------------------------------------------------------
 CREATE OR REPLACE FUNCTION increment() 
 RETURNS text AS $$ BEGIN RETURN 'hello world!' ; END; $$ LANGUAGE plpgsql;
 select increment() as "Greeting";
----------------------------------------------------------
SELECT concat('hello', ' ', 'world!') AS "Greeting";
----------------------------------------------------------
CREATE TABLE hellosqlworld (Greeting TEXT);
INSERT INTO hellosqlworld (Greeting) VALUES ('hello world!');
select * from hellosqlworld;
----------------------------------------------------------
CREATE TABLE GREE("Greeting" VARCHAR(20));
INSERT INTO GREE ("Greeting")
VALUES('hello world!');
SELECT "Greeting" FROM GREE;
----------------------------------------------------------
CREATE TABLE table1 (
  "Greeting" text NOT NULL
);

INSERT INTO table1 ("Greeting")
VALUES ('hello world!');

SELECT *
FROM table1;
*/