# Write your MySQL query statement below

SELECT Round(COUNT(player_id)/(SELECT count(distinct player_id) from activity),2) as fraction
from activity where (player_id, date_sub(event_date, interval 1 day))
in (SELECT player_id, min(event_date) 
FROM Activity GROUP BY player_id)

