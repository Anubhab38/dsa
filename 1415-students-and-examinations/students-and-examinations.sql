# Write your MySQL query statement below
select s1.student_id, s1.student_name, s2.subject_name, count(e.student_id) as attended_exams 
from Students s1
cross join subjects s2
left join Examinations e on e.student_id=s1.student_id
and e.subject_name=s2.subject_name
group by s1.student_id, s1.student_name, s2.subject_name
order by s1.student_id, s2.subject_name;