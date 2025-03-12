# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to move min and max elements to the start and to the end of the array. 
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the array and search for max element. Then, we move element right and increment result var. After that we decrement index i and repeat the operation. We do it until the max element is set to last position in the array. Then, we do the same with the minimal element = 1, and move it to the left. We do it until element = 1 (the minimal element) is set to 0 index of the array. Then, we just return the result var.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int result = 0;

        for(int i =0;i<nums.length-1;i++)
        {
            if(nums[nums.length-1]==nums.length)break;
            if(nums[i]==nums.length) {
                int temp = nums[i + 1];
                nums[i+1]=nums[i];
                nums[i]=temp;
                i=-1;
                result++;
            }
        }

        for(int i=1;i<nums.length;i++)
        {
            if(nums[0]==1)break;
            if(nums[i]==1){
                int temp = nums[i-1];
                nums[i-1]=nums[i];
                nums[i]=temp;
                i=0;
                result++;
            }
        }

         return result;
    }
}
```