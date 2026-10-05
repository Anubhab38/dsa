# Write your MySQL query statement below
select user_id, max(time_stamp) as last_stamp from Logins l1
where year(l1.time_stamp)='2020'
group by user_id;