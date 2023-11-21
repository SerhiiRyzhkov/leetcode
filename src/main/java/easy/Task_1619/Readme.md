# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Probably we will need to sort the input array.
# Approach
<!-- Describe your approach to solving the problem. -->
We sort the array. Then, we calculate a part of the array, that have to be skipped. Then we iterate only over the necessary part of the array and calculate average value and return it.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(NlogN)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int skip = arr.length / 20;
        int sum = 0;
        int amount = 0;
        for (int i = skip; i < arr.length - skip; i++) {
            sum += arr[i];
            amount++;
        }
        return (double) sum/amount;
    }
}
```