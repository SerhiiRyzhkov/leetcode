# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Integer class has toString method that resolve a problem in 1 row.
# Approach
<!-- Describe your approach to solving the problem. -->
We use static method toString of Integer class. On of his type can return string value in different representations.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String convertToBase7(int num) {
        return Integer.toString(num,7);
    }
}
```