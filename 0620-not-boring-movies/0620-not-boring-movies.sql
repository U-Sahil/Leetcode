SELECT * 
FROM Cinema 
Where description != 'boring' AND id%2 != 0
Order by rating DESC;