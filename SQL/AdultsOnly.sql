/* 8KYU CodeWars Adults Only

In your application, there is a section for adults only. 
You need to get a list of names and ages of users from 
the users table, who are 18 years old or older.

users table schema

name
age

NOTE: Your solution should use pure SQL. Ruby is used 
within the test cases just to validate your answer.

*/
SELECT *
FROM users
WHERE age >= 18;
/*------------------------------------------------------------
drop table if exists users;
create table users (
name character varying(128) not null,
age int not null check(age >=18)
);
insert into users (name,age) values
('a',185),
('b',172),
('c',133),
('d',24);
select * from users;
--------------------------------------------------------------
drop table users;

create table users (name varchar(50), age int);



Insert into users (name, age)
Values ('Max', 14), ('Peter', 23), ('Stefan', 43), ('Hugo', 35), ('Klaus', 55);

select * from users where age >= 18;
---------------------------------------------------------------
SELECT name, age
FROM users 
WHERE age >= 18
ORDER BY name
-----------------------------------------------------------------
create table bigboy 
( 
  Name varchar(20), 
  Age INT DEFAULT (18) 
);

insert into bigboy (name)
values 
('Andrey'),
('Dmitriy'),
('Maksim'),
('Valera');

select * from bigboy 
-------------------------------------------------------------------
create table adults(
        name text,
        age integer
);

insert into adults(name, age)
values('Tony Corleone', 30);
insert into adults(name, age)
values('Irwin Dundee', 18);
insert into adults(name, age)
values('Kitty Dream', 25);
insert into adults(name, age)
values('Yuno Sykk', 25);
insert into adults(name, age)
values('Johnny Doe', 15);
insert into adults(name, age)
values('Christine Pristine', 16);
insert into adults(name, age)
values('Fion Fifi', 17);

select * 
from adults
where age >= 18;
*/