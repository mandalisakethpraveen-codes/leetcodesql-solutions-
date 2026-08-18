# Write your MySQL query statement below
select e.name from employee e 
where e.id IN (
    select managerId
    from employee
    group by managerId
    HAVING COUNT(*)>=5
);