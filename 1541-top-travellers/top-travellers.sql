# Write your MySQL query statement below
select name, ifnull(sum(distance), 0) as travelled_distance
from Users u1
left join Rides r1
on u1.id=r1.user_id
group by u1.id
order by travelled_distance desc, u1.name asc;