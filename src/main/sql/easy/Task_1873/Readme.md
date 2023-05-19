# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The obvious wat to reach the target is using "Searched case" because we have to check two conditions. And the only way to do that is "Searched case"
# Approach
<!-- Describe your approach to solving the problem. -->
We filter results when name starts with "M" using operator "LIKE" also we filter results when employee_id is even using operator "MOD"
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
select employee_id,
 case 
 when (mod(employee_id,2)=0 or name like'M%') then 0
 else salary
 end 
 as 'bonus'
 from Employees order by employee_id;
```