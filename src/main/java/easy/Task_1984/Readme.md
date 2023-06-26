# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need to separate the input array into several arrays with length=k
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we need to work out cases when we are not able to separate the input array (when nums.length < k). In these cases we have to return 0. Otherwise, we sort the input array and further work with sorted array. We separate it into many arrays with length = k. According to the fact that the array is sorted we know that the first element of the inner array is min and the last one is max. Then we just check every inner array and override min var if we found new minimal value.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(nlogn)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length<k)return 0;
        Arrays.sort(nums);
        int l=0;
        int min = nums[l+k-1]-nums[l];
        while (l<nums.length-k+1){
            if((nums[l+k-1]-nums[l])<min)min=nums[l+k-1]-nums[l];
            l++;
        }
        
        return min;
    }
}
```