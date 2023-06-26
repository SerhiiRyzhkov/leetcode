# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Probably, we will need to use subquery to resolve the problem
# Approach
<!-- Describe your approach to solving the problem. -->
We select employee_id from the table where salary <30000, also we need to search only employees who`s manager_id is not in the list of employee_id. To reach that we use multiple row subquery. In the subquery we just select all the employee id from the table. Finally, we order the result by employee_id column. 
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