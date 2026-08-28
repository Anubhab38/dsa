# Write your MySQL query statement below
select e1.name, bonus from Employee e1
left join bonus b1 on e1.empId=b1.empId
where isnull(bonus) or bonus<1000;
