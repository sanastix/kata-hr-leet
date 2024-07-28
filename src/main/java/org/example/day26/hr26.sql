select
    max(case when Occupation = 'Doctor' then Name else null end) as Doctor,
    max(case when Occupation = 'Professor' then Name else null end) as Professor,
    max(case when Occupation = 'Singer' then Name else null end) as Singer,
    max(case when Occupation = 'Actor' then Name else null end) as Actor
from (
    select Name, Occupation,
        row_number() over (partition by Occupation order by Name) as RowNumber
    from OCCUPATIONS
) as OrderedNames
group by RowNumber
order by RowNumber;