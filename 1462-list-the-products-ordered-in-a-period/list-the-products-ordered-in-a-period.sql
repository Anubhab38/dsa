# Write your MySQL query statement below
select product_name, sum(unit) as unit
from Products p1
join Orders o1
on p1.product_id=o1.product_id
where o1.order_date>='2020-02-01' and o1.order_date<'2020-03-01'
group by p1.product_id
having sum(unit)>=100;