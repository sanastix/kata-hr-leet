with SortedLatitudes as (
    select LAT_N, row_number() over (order by LAT_N) as RowAsc,
        row_number() over (order by LAT_N desc) as RowDesc
    from STATION
)
select round(avg(LAT_N), 4)
from SortedLatitudes
where RowAsc = RowDesc or RowAsc + 1 = RowDesc;