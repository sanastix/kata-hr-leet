select d.id, d.name
from departments d
where exists (
    select 1
    from sales s
    where price > 98.00 and s.department_id = d.id
)