# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It will be easy to check the array if we sort it before checking

# Approach
<!-- Describe your approach to solving the problem. -->
We sort the array. Then we find delta between the first and the second elements of the array. Then we iterate over the array and check delta between elements until we find different delta.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n log(n))
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int delta = arr[1]-arr[0];
        for(int i = 1;i<arr.length;i++)
            if(arr[i]-arr[i-1]!=delta)return false;


        return true;
    }
}
```