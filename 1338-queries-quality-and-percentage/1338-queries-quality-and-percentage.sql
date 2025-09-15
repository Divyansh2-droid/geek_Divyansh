# Write your MySQL query statement below

select query_name, 
Round(sum(rating/position)  / count(distinct result) ,2) As quality 
, Round(sum(rating <3) * 100.0 / count(distinct result) ,2) As
poor_query_percentage
from Queries
Group BY query_name;