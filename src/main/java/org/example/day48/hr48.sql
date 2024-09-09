select c.name
from city c
join country on c.countrycode = country.code
where country.continent = 'Africa';