# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need iterate over an array and count increasing and decreasing sub-arrays simultaneously. 
# Approach
<!-- Describe your approach to solving the problem. -->
We use 4 vars: current size of increasing sub-array, current size of decreasing sub-array. maximal size of increasing sub-array, maximal size of decreasing sub-array. We iterate over the input array and check each element with a previous one. If we find increasing subsequence we increment increasing vars. If we find decreasing subsequence we increment decreasing vars. Otherwise, we reset current counters. In the end, we just return maximal size of subsequences using Math.max method. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increasing = 1;
        int increasingMax = 1;
        int decreasing = 1;
        int decreasingMax = 1;


        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1])
                increasing++;
            else
                increasing=1;

            if(nums[i]<nums[i-1])
                decreasing++;
            else
                decreasing=1;

            increasingMax=Math.max(increasingMax,increasing);
            decreasingMax=Math.max(decreasingMax,decreasing);
        }

        return Math.max(increasingMax,decreasingMax);
    }
}
```