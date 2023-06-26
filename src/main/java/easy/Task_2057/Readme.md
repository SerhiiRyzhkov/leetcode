# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Operator % will definitely resolve the problem.
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the input array and check if the current element equals to index mod 10. If we found the value than we return it. Else we keep iterating. If we iterated through the all array it means we have not found the element, and we have to return -1.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int smallestEqual(int[] nums) {
           for(int i=0;i<nums.length;i++)
            if(nums[i]==i%10)return i;
        return -1;
    }
}
```