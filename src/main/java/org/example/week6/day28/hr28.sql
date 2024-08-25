select
    c.company_code,
    c.founder,
    count(distinct lm.lead_manager_code) as total_lead_managers,
    count(distinct sm.senior_manager_code) as total_senior_managers,
    count(distinct m.manager_code) as total_managers,
    count(distinct e.employee_code) as total_employees
from
    Company c
left join
    Lead_Manager lm ON c.company_code = lm.company_code
left join
    Senior_Manager sm ON c.company_code = sm.company_code
left join
    Manager m ON c.company_code = m.company_code
left join
    Employee e ON c.company_code = e.company_code
group by
    c.company_code, c.founder
order by
    c.company_code;
