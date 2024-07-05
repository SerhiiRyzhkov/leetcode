# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to use group by and to find a customer who has the biggest amount of orders.
# Approach
<!-- Describe your approach to solving the problem. -->
1)select customer_number,count(customer_number) from orders  group by customer_number;
We get amount of orders of each customer
2)select customer_number,count(customer_number) from orders  group by customer_number order by count(customer_number) desc;
We change order to get the customer with the maximal amount of orders to the first place.
3)select customer_number from orders  group by customer_number order by count(customer_number) desc limit 1;
We use limit to take only the first customer. Also, we remove count column. We do not need that for final result 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
select customer_number from orders  group by customer_number order by count(customer_number) desc limit 1; 
```