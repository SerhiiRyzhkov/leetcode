# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Probably one of the Integer class methods will help to resolve the problem
# Approach
<!-- Describe your approach to solving the problem. -->
We create result array and fill every element of the array using method bitCount() of Integer class.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] countBits(int n) {
        int [] ans = new int[n+1];
        for(int i=0;i<ans.length;i++)
            ans[i]=Integer.bitCount(i);
        return ans;
    }
}
```