# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should use JOIN table to resolve it.
# Approach
<!-- Describe your approach to solving the problem. -->
First step: we use table join on email, to join two tables:
select * from person P1 join person P2  ON P1.Email=P2.Email;

Second step: We search for emails that we have to delete. We have to find rows from these two tables, that have the same email and id of the email in second table is bigger than in the first table.
select * from person P1 join person P2  ON P1.Email=P2.Email and
P1.Id<P2.Id;

Third step: in second table we got rows that we have to delete. So we do it, we delete the second table completely:

DELETE P2 from person P1 join person P2  ON P1.Email=P2.Email and
P1.Id<P2.Id;


# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
DELETE P2 from person P1 join person P2  ON P1.Email=P2.Email and
P1.Id<P2.Id;
```