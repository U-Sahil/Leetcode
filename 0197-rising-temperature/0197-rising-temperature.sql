select today.id 
from weather yesterday 
cross join weather today 
where DATEDIFF(today.recordDate,yesterday.recordDate) = 1 
AND today.temperature > yesterday.temperature ;