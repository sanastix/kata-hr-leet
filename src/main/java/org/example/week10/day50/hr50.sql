select
    case
        when g.Grade < 8 then 'NULL'
        else s.Name
    end as Name,
    g.Grade,
    s.Marks
from Students s
join Grades g
    on s.Marks between g.Min_Mark and g.Max_Mark
order by
    g.Grade desc,
    case
        when g.Grade < 8 then s.Marks
        else s.Name
    end asc;