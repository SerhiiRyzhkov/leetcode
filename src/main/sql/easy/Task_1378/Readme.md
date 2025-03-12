# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We just need to use join to resolve it
# Approach
<!-- Describe your approach to solving the problem. -->
We are free to use right join or left join to resolve it. It depends on the table where we execute select statement. If we use employees we need to use left join. In that time, of we use employeeuni we use right join.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
select unique_id, name from employees left join
                              employeeuni on employees.id=employeeuni.id;

```