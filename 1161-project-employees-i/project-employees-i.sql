# Write your MySQL query statement below
select project_id,
round(sum(experience_years)/count(*),2)
as average_years
from project
join employee
on project.employee_id=employee.employee_id
group by project_id