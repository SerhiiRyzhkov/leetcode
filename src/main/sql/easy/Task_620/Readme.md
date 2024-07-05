# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s a simple select statement with 'where' and 'order by'
# Approach
<!-- Describe your approach to solving the problem. -->
Step by step solution:
1) Select all rows:

    select * from cinema;

   1	War	great 3D	8.9
   2	Science	fiction	8.5
   3	irish	boring	6.2
   4	Ice song	Fantacy	8.6
   5	House card	Interesting	9.1
2) Filter "only odd id":

    select * from cinema where id%2=1;

   1	War	great 3D	8.9
   3	irish	boring	6.2
   5	House card	Interesting	9.1
3) Filter "not boring description":

    select * from cinema where id%2=1 and description!='boring';
   
   1	War	great 3D	8.9
   5	House card	Interesting	9.1
4) Descending Order by rating:

    select * from cinema where id%2=1 and description!='boring' order by rating desc;
   
   5	House card	Interesting	9.1
   1	War	great 3D	8.9

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(nlogN)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
select * from cinema where id%2=1 
    and description!='boring' 
                     order by rating desc;
```