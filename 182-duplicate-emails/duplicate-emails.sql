# Write your MySQL query statement below

SELECT email as Email
From Person
Group By email
HAVING Count(email) > 1;