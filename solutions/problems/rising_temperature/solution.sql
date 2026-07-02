# Write your MySQL query statement below
Select W.id from Weather W join Weather r on datediff(W.recordDate,r.recordDate)=1
where W.temperature>r.temperature ;