# Write your MySQL query statement below
select a.name "Employee" from employee as a where salary>(select salary from employee where id=a.managerId)