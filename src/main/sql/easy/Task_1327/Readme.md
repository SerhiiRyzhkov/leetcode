# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It has to be joining of two tables and grouping by unit column. Also, it will need filter of date and amount of units
# Approach
<!-- Describe your approach to solving the problem. -->
1 step) We do join of two tables:
SELECT * FROM products JOIN orders ON (orders.product_id=products.product_id);
2 step) We limit date interval:
SELECT * FROM products JOIN orders ON (orders.product_id=products.product_id) WHERE (order_date BETWEEN '2020-02-01' AND '2020-02-29');
3 step) We choose columns what we are going to work with.
SELECT product_name,unit as 'unit' FROM products JOIN orders ON (orders.product_id=products.product_id) WHERE (order_date BETWEEN '2020-02-01' AND '2020-02-29');
4 steps) We add sum(unit) to the statement:
SELECT product_name,sum(unit) as 'unit' FROM products JOIN orders ON (orders.product_id=products.product_id)
WHERE (order_date BETWEEN '2020-02-01' AND '2020-02-29') group by product_name;
5 step) we limit output by amount of units >=100:
SELECT product_name,sum(unit) as 'unit' FROM products JOIN orders ON (orders.product_id=products.product_id)
WHERE (order_date BETWEEN '2020-02-01' AND '2020-02-29') group by product_name;

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
select product_name,sum(unit) as 'unit' from products
join orders on (orders.product_id=products.product_id) 
where (order_date between '2020-02-01' AND '2020-02-29') 
group by product_name having sum(unit)>=100;
```