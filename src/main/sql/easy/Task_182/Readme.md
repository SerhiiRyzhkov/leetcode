# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
There are two ways to resolve the problem: grouping by and using subquery, But using grouping is much easier and much compacter then subquery.
# Approach
<!-- Describe your approach to solving the problem. -->
1) We apply group by to the select statement, and we are able to see what emails are unique in a table:
   Select count(email),email  from Person group by email;
2) Then we should exclude unique emails from the result table:
   Select count(email),email  from Person group by email having count(email)>1;
3) Then we rename column to 'Email' according to problem description and get the final result. Also, we don`t need count column anymore:
   Select email as 'Email' from Person group by email having count(email)>1;
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
Select email as 'Email' from Person group by email having count(email)>1;
```