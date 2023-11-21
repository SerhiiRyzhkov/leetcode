# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We can use reverse method of StringBuilder to resolve the problem
# Approach
<!-- Describe your approach to solving the problem. -->
We compare value x as string to reversed value x as string. Reversed value we get using StringBuilder.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        StringBuilder reverse = new StringBuilder().append(x).reverse();
        return String.valueOf(x).equals(reverse.toString());
    }
}
```