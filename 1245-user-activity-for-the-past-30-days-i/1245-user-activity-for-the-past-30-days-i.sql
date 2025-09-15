# Write your MySQL query statement below
SELECT activity_date as day, Count(Distinct(user_id)) as active_users
FRom activity
group by activity_date, EXTRACT(month from activity_date)
having activity_date BETWEEN '2019-06-28' AND '2019-07-27'
