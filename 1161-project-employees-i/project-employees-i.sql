# Write your MySQL query statement below
select p1.project_id, round(avg(experience_years),2) as average_years
from project p1
join employee e1
on e1.employee_id=p1.employee_id
group by p1.project_id;