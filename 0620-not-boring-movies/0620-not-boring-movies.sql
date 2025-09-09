# Write your MySQL query statement below
SELECT *
FROM Cinema
WHERE id % 2 = 1        -- odd IDs filter karne ke liye
  AND description <> 'boring'   -- boring description hata do
ORDER BY rating DESC;   -- rating ke descending order me sort
