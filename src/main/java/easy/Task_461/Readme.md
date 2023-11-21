# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should use bitCount method.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we invert x and y. Transform 0001 to 1110. Then we, using boolean logical exclusive OR ^, find where we have the different bits. According to the fact, we used inversion previously we actually find the same bits. And, finally, all we have to do is to count bits, using bitCount method.


# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount((~x^~y));
    }
}
```