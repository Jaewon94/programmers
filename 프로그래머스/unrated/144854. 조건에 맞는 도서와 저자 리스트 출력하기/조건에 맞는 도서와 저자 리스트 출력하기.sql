-- 코드를 입력하세요
SELECT 
    B.BOOK_ID as BOOK_ID, 
    A.AUTHOR_NAME as AUTHOR_NAME, 
    TO_CHAR(B.PUBLISHED_DATE,'YYYY-MM-DD') as PUBLISHED_DATE 
    from book B join author A on B.author_id = A.author_id where category = '경제' order by published_date;