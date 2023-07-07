# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need test case where we will check lines to get final output 
# Approach
<!-- Describe your approach to solving the problem. -->
So, we can get a triangle from 3 lines only when sum of any two lines is more than length of the third line. So we just check all 3 lines (x,y,z) that their length is less than sum of other lines.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below

select x,y,z,
case 
when x+y>z and x+z>y and y+z>x then 'Yes'
else 'No'
end
as 'triangle'
from triangle;
```