(select city, length(city) as length
from station
order by length(city) asc, city asc
limit 1)
union all
(select city, length(city) as length
from station
order by length(city) desc, city asc
limit 1);