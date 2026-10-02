# Write your MySQL query statement below
select activity_date as day, count(distinct user_id) as active_users
from Activity 
group by day
having max(day)<='2019-07-27' and min(day)>='2019=06-28'
order by day asc;