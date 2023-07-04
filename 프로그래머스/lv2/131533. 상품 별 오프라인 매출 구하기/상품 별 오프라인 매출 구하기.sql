-- 코드를 입력하세요
SELECT 
    P.PRODUCT_CODE, 
    sum(p.PRICE * O.SALES_AMOUNT) as sales 
    from product P join offline_sale O 
    on P.product_ID = O.product_ID 
    group by P.PRODUCT_CODE
    order by sales desc, P.PRODUCT_CODE;