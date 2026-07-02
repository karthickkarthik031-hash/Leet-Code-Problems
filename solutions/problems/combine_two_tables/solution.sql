# Write your MySQL query statement below
select lastName,firstName,city,state from Person P left join Address A on P.personId=A.personId;