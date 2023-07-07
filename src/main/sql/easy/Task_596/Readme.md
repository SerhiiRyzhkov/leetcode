# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Probably we should count group function.
# Approach
<!-- Describe your approach to solving the problem. -->
It`s comfortable to resolve the problem step by step. Firstly, We count amount of students for every class. We use count() group function to reach that.

select class, count(*) from courses group by class;

Then, we remove all the classes where amount of students less than 5.

select class, count(*) from courses group by class having count(*)>=5;

And finally, remove count column and get final result:

select class from courses group by class having count(*)>=5;

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
select class from courses group by class having count(*)>=5;
```