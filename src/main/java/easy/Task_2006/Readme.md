# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The obvious way to resolve a problem is checking every pair of elements with simple for loops.
# Approach
<!-- Describe your approach to solving the problem. -->
We create count var. Then we check every pair of elements using two for loops. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n2)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;

        for(int i=0;i<nums.length-1;i++)
            for(int j=i+1;j<nums.length;j++)
                if(Math.abs(nums[i]-nums[j])==k)count++;

        return count;
    }
}
```