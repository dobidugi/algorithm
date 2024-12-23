SELECT
    COUNT(*) AS FISH_COUNT,
    MAX(LENGTH) AS MAX_LENGTH,
    FISH_TYPE
FROM FISH_INFO
GROUP BY FISH_TYPE
HAVING (SUM(IFNULL(LENGTH,10)) / FISH_COUNT)  >= 33
ORDER BY FISH_TYPE;