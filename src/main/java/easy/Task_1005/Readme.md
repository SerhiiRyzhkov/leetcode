# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It is better to sort the array. It will be easy to work on it.
# Approach
<!-- Describe your approach to solving the problem. -->
We sort the array. Then we iterate over the array. And replace all first negative elements. We stop to do it when elements become positive or if we change elements k times. If we change elements k times we just return sum. Otherwise, we change the smallest not negative element and return sum. It`s convenient to do it with using Stream API and ternary operator.     
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(nlogn)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        for(int i=0;i<nums.length&&k!=0;i++)
        {
            if(nums[i]<0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        
        int sum = Arrays.stream(nums).sum();
        int min = Arrays.stream(nums).min().getAsInt();
        
        return (k%2==0)?sum:sum-min*2;
    }
}
```