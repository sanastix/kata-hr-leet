select max(total_earnings) as max_total_earnings,
count(*) as num_employees
from (
    select months * salary as total_earnings
    from Employee
) as earnings
where total_earnings = (select max(months * salary) from Employee);