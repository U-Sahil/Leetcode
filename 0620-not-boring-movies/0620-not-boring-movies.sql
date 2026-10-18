SELECT *     
FROM Cinema 
WHERE description != 'boring' AND id%2 != 0 
ORDER by rating  DESC;