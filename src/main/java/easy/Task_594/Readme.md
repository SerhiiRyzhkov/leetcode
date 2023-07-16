# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
To solve the problem we should sort the array.
# Approach
<!-- Describe your approach to solving the problem. -->
First of all, we sort the input array. Then, we use 4 vars: max - it is the result var; count - classical var count; index = start of subarray, flag - it is a marker, that show that subarray does not have the same numbers.
Then we iterate over the array. If the difference between two elements equals or less than 1, we increment var count. Also, we check if subarray does not have the same numbers with flag var. If the difference between start element of subarray and current element is greater than 1, it means that the subarray is ended. Then we consider this subarray. If it`s size if greater the max, and we have more than 1 element in subarray, and the subarray contains different numbers - we write down a new value to max var. After end of for loop we consider last subarray also. And return max var. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(nlogN)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int findLHS(int[] nums) {
        int max = 0;
        int count =1;
        int index = 0;
        boolean flag=false;
        Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++)
        {
            if(Math.abs(nums[i]-nums[index])<=1)
            {
                count++;
                if(nums[i]!=nums[index])flag=true;
            }
            else {
                if((count>1)&&(count>max)&&(flag))max=count;
                flag=false;
                count=1;
                i=++index;
            }
        }
        if((count>1)&&(count>max)&&(flag))max=count;
        return max;
    }
}
```