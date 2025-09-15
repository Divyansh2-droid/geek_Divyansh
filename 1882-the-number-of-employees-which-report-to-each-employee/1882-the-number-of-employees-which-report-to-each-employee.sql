# Write your MySQL query statement below
WITH cte AS (
    SELECT e.employee_id,
    m.name as m_name,
    m.employee_id as manager_id,e.name as e_name,
    e.age
    FROM employees e
    JOIN employees m
    ON e.reports_to= m.employee_id
    )
SELECT manager_id as employee_id,
m_name as name,
COUNT(*) AS reports_count,
ROUND(AVG(age)) AS average_age
FROM CTE
GROUP BY  manager_id
ORDER BY manager_id;