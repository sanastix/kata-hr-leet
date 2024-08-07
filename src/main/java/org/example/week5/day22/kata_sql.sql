select rank() over (order by sum(points) desc) as rank,
coalesce(nullif(clan, ''), '[no clan specified]') as clan,
sum(points) as total_points,
count(*) as total_people
from people
group by coalesce(nullif(clan, ''), '[no clan specified]')
order by total_points desc;