# Write your MySQL query statement below

SELECT ans.machine_id, ROUND(sum(ans.diff)/count(ans.process_id),3) as processing_time
 FROM (
SELECT a1.machine_id,a1.process_id, (a2.timestamp - a1.timestamp) as diff
FROM Activity a1
JOIN Activity a2
ON (a1.machine_id = a2.machine_id and 
a1.process_id = a2.process_id and 
a1.activity_type = 'start' and 
a2.activity_type = 'end' 
)
) ans GROUP BY ans.machine_id