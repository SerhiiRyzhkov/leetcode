# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
According to problem we will need use case to find solution.

# Approach
<!-- Describe your approach to solving the problem. -->
We just combine update statement with simple case to solve problem

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
update salary set sex = case sex 
when 'f' then 'm' 
when 'm' then 'f'
end;
```