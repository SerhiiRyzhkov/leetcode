# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need iterate over interval between left and right and over the input ranges at the same time
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate inside interval left - right. Inside that loop we also iterate over the ranges array. We check if at least on elements is not inside interval we immediately return false, otherwise we keep iterating.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for(int i=left;i<=right;i++){
            boolean flag=false;
            for (int[] range : ranges) {
                int start = range[0];
                int end = range[1];
                if ((start <= i) && (end >= i)) {
                    flag = true;
                    break;
                }
            }
            if(!flag)return false;
        }
        return true;
    }
}
```