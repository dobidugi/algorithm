-- 코드를 입력하세요
SELECT 
    ANIMAL_ID, 
    NAME 
FROM ANIMAL_INS 
WHERE upper(NAME) like "%EL%"
AND ANIMAL_TYPE = 'Dog'
order by NAME asc;