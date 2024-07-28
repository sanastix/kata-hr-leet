select d.id, d.name
from departments d
where d.id in (
    select s.department_id
    from sales s
    where s.price > 98.00
);