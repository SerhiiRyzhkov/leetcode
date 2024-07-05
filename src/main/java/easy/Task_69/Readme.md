# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We can use bruteforce
# Approach
<!-- Describe your approach to solving the problem. -->
The easiest way to resolve a problem is using bruteforce. We just iterate a var until we get the result or the nearliest value.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int mySqrt(int x) {
        Long result=0L;
        while (result*result<=x)result++;
        return result.intValue()-1;
    }
}
```