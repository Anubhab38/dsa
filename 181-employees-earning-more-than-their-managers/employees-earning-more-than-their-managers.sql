# Write your MySQL query statement below
select e.name as Employee from Employee e
-- employee e
inner join employee m
on m.id=e.managerId
where e.salary>m.salary;