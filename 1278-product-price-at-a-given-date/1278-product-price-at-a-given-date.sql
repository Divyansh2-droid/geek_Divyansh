# Write your MySQL query statement below
# Write your MySQL query statement below
with cte as (select product_id, new_price, change_date, 
row_number() over(partition by product_id order by change_date desc) as rnum
from Products
where change_date <= "2019-08-16"),

distinct_pids as (select distinct product_id from Products)

select d.product_id, ifnull(c.new_price, 10) as price from distinct_pids d
left join cte c on d.product_id = c.product_id and c.rnum=1