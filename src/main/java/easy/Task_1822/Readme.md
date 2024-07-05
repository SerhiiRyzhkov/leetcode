# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We do not need to search product. We just have to find it sign.
# Approach
<!-- Describe your approach to solving the problem. -->
We do not need to multiply result var because it may be an enormous number. We just have to find it`s sign. So we just change the sign of result var every time when we find negative number in the array. Also, if we found 0, it means we do not have to continue check numbers: we get 0.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int arraySign(int[] nums) {
       int result = 1;

        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) result *= -1;
        }
           return result;
    }
}
```