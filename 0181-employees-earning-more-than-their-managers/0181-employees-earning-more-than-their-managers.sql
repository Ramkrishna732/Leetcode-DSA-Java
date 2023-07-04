# Write your MySQL query statement 
select a.name as Employee from employee as a, employee as b
where a.managerid=b.id and a.salary> b.salary;

