# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need group by query_name and use round and group functions;
# Approach
<!-- Describe your approach to solving the problem. -->
step 1) we define columns which we are going to show:
select query_name, rating/position as quality, rating, if(rating<3,1,0) from queries;
strep 2)We add round, sum, count functions to calculate presents, also we add group by.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
select query_name, round(avg(rating/position),2) as quality, round(sum(if(rating<3,1,0))/count(*)*100,2) as poor_query_percentage
 from queries group by query_name;
```