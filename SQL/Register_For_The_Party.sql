/* 8KYU CodeWars Register For The Party

You received an invitation to an amazing party. Now you 
need to write an insert statement to add yourself to the 
table of participants.

participants table schema

name (string)
age (integer)
attending (boolean)
NOTES:

Since alcohol will be served, you can only attend if you are 
21 or older You can't attend if the attending column returns 
anything but true 

NOTE: Your solution should use pure SQL. Ruby is used within 
the test cases just to validate your answer.

*/
INSERT INTO participants(name, age, attending)
VALUES ('George Jefferson', 23, TRUE);
SELECT * FROM participants;

/*----------------------------------------------------------------
INSERT INTO participants VALUES ('mozart', '26', true);

SELECT * FROM participants;

------------------------------------------------------------------
INSERT into participants (name, age, attending) values ('Greg', 21, true);

SELECT * FROM participants;

------------------------------------------------------------------
INSERT INTO participants (
  name,
  age,
  attending
) VALUES (
  'Donald',
  21, -- I'm actually only 18 but not gonna let my age get in the way of me partying :p
  TRUE
);

SELECT * FROM participants;
------------------------------------------------------------------
INSERT INTO participants (name, age, attending)
VALUES ('DROP TABLE', '404', 'true');

SELECT * FROM participants;

-------------------------------------------------------------------
INSERT INTO participants (name, age, attending)
VALUES ('Jay', '22', 'true');

SELECT * FROM participants;

-------------------------------------------------------------------
INSERT INTO participants (name, age)
VALUES ('Aki', 27);

SELECT 
  name, 
  age,
  (CASE 
    when age>=21 then 1=1
    else 1=0
   END) as attending 
FROM participants

*/