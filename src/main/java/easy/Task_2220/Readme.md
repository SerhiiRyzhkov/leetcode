# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
bitCount method will help to resolve the problem
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we use bitwise XOR (exclusive OR) start^goal. We get '1' in slots that we have to flip, and '0' in slots. Then, we just have to count bits, using bitCount method and return the amount of bits. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int minBitFlips(int start, int goal) {
           return Integer.bitCount(start^goal);
    }
}
```