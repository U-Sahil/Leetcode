SELECT actor_id, director_id 
FROM ActorDirector
group by actor_id,director_id 
HAVING count(timestamp)>=3;