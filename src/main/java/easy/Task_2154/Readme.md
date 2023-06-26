# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We may consider recursion as a possible way to resolve the problem.
# Approach
<!-- Describe your approach to solving the problem. -->
We will use boolean var. We iterate over the input array and looking for element equals to original. Of we found it, we stop iterating, then we multiply original by two and, using recursion call method one more time with new value of original. We do it util we are able to iterate over the array without founding an element that equals to original. Then we have to return original.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
O(n)
# Code
```
class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean found =false;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==original){found=true;break;}
        if(found){
            original*=2;
            original=findFinalValue(nums,original);
        }
        return original;    }
}
```