# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Regarding the fact, we need to search few maximal elements in array, it will be convenient to sort it.
# Approach
<!-- Describe your approach to solving the problem. -->
We sort the input array, calculate sum of all elements. Then starting from the biggest element we start to add maximal elements to var total util total equals or less, then other elements of the array. In that time we also write them to result list. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
NlogN
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer>result = new ArrayList<>();
        int [] sorted = Arrays.stream(nums).sorted().toArray();
        int index = nums.length-1;
        int total=0;

        int sum = Arrays.stream(sorted).sum();

        while (total<=sum-total) {
            total += sorted[index];
            result.add(sorted[index--]);
        }

        return result;
    }
}
```