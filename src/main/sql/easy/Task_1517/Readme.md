# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
I have to remember regular expressions to solve it.
# Approach
<!-- Describe your approach to solving the problem. -->
So the idea of solution we have to use regular expression to resolve it.
'^[A-Z][A-Z0-9_.-]*[@]leetcode[.]com$';


1)^[A-Z] :  caret(^) matches Beginning of string.
2)[A-Z0-9_.-] It means that a string that may contain letters (upper or lower case), digits, underscore '_', period '.', and/or dash '-'.
3)* It means that we can have 0 or bigger amount of previous element of regex.
4)leetcode[.]com It means, that all the mails have to be ended with leetcode.com.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
# Write your MySQL query statement below
select * from Users where mail regexp '^[A-Z][A-Z0-9_.-]*[@]leetcode[.]com
```;

```