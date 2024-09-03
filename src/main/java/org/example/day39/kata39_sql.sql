select
    extract(month from payment_date) as month,
    count(*) as total_count,
    sum(cast(amount as numeric)) as total_amount,
    count(case when staff_id = 1 then 1 end) as mike_count,
    sum(case when staff_id = 1 then cast(amount as numeric) end) as mike_amount,
    count(case when staff_id = 2 then 1 end) as jon_count,
    sum(case when staff_id = 2 then cast(amount as numeric) end) as jon_amount
from payment
group by month
order by month;