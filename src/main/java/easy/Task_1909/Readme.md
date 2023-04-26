# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
I may change container to List to be able to remove element, or I may change element if I use simple array
# Approach
<!-- Describe your approach to solving the problem. -->
We create boolean that show if change has been made by the moment. Then we iterate over the array. If current element not bigger than previous one we change it to previous one and set boolean as true. The next "wrong" element will return false from the method because we have already changed the boolean "removed"
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean canBeIncreasing(int[] nums) {
       boolean removed = false;
        for(int i=1;i<nums.length;i++)
            if(nums[i] <= nums[i-1]) {
                if(removed) return false;
                removed = true;
                if (i>1 && nums[i] <= nums[i-2])
                    nums[i] = nums[i-1];
            }

        System.out.println(Arrays.toString(nums));
        return true;
    }
}
```