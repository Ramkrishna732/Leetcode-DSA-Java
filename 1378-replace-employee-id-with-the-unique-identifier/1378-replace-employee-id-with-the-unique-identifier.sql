# Write your MySQL query statement below


select ifnull(eu.unique_id,null) as unique_id,e.name
from employees as e left join employeeuni as eu on e.id=eu.id 
