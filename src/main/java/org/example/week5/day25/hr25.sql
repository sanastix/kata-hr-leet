select concat(Name,'(',substring(Occupation,1,1),')') as result
from OCCUPATIONS
order by Name;
select concat('There are a total of ',count(*),' ',lower(Occupation),'s.') as result
from OCCUPATIONS
group by Occupation
order by count(*),Occupation;