# Write your MySQL query statement below
select m.name as name 
from Employee e
join Employee m 
on e.managerid = m.id
group by m.id,m.name
having count(*) >= 5;