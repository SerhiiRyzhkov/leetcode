# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We have two obvious ways - to create hashmap and keep nums and their indexes or just use inner loop.
# Approach
<!-- Describe your approach to solving the problem. -->
Using two loops seems to be much brief way to solve the problem. So we just create two loops and compare all the elements from the input array with each other. And if we found suitable nums we write down them to result var. In the end we just return the result var. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n2)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maximumDifference(int[] nums) {
        int result=-1;
        for(int i=0;i<nums.length;i++)
            for(int j=0;j<nums.length;j++)
                if((i<j)&&(nums[j]-nums[i]>0)&&(nums[j]-nums[i]>result))
                    result = nums[j] - nums[i];

                    return result;
    }
}
```