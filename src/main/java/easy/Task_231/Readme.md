# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The only way to resolve the problem without recursion or loops is to count bits with '1' in BIN representation of the input number. 
# Approach
<!-- Describe your approach to solving the problem. -->
There is a fact, that all numbers 2^x has the only '1' in bin representation of the number. And x=number of bit. So we are able to use method bitCount() of Long class. We just check if the number in bin has the only '1'.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isPowerOfTwo(int n) {
       return Long.bitCount(n)==1;
    }
}
```