# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem can be easily solved by simple iteration and checking every pair of elements. Bruteforce method.
# Approach
<!-- Describe your approach to solving the problem. -->
We use two vars to solve the problem. max var - here we write the maximal length of increasing subsequence. current var - here we write the length of current subsequence. After the end of iterating the maximal length will be kept in max var or in current var (in a case when the maximal sub is the last sub in an array). And all we need is return maximal value between these two vars. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=1;
        int current =1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])current++;
            else {
                max=Math.max(current,max);
                current=1;
            }
        }

        return Math.max(current,max);
    }
}
```