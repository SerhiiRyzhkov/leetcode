# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The best and the briefest way to resolve the problem will be using stream API
# Approach
<!-- Describe your approach to solving the problem. -->
Using stream API we convert input array -> stream -> stream where every element = el^2 -> sorted stream -> array of ints. And we return this array. It`s not the fastest way, but obviously the briefest and the easiest. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n log n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(el->(int)Math.pow(el,2)).sorted().toArray();
    }
}
```