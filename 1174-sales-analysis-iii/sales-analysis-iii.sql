# Write your MySQL query statement below
select p1.product_id, p1.product_name from product p1
join sales s1
on p1.product_id = s1.product_id
group by p1.product_id, p1.product_name
having min(s1.sale_date)>='2019-01-01' and max(sale_date)<='2019-03-31';
