# Write your MySQL query statement below
select r1.contest_id, round(
    count(r1.user_id)*100.0/(select count(*) from users)
    ,2) as percentage
from Register r1
group by r1.contest_id
order by percentage desc, contest_id asc;
