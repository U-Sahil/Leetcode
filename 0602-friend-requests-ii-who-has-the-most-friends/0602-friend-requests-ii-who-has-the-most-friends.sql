# Write your MySQL query statement below
WITH myCTE AS(
    Select requester_id id from RequestAccepted
    UNION ALL
    Select accepter_id id from RequestAccepted
)
Select id , COUNT(*) as num
From myCTE
Group By id
Order By num Desc
LIMIT 1