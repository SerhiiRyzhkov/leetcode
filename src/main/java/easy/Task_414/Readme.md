# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We can use stream API with brief code but O(nlogn) complexity or simple array with additional vars with O(n) complexity, however code will be longer.
# Approach
<!-- Describe your approach to solving the problem. -->
I have chosen Stream API way. Firstly we delete duplicates from the input array and sort it. Then, according to array size we return third max element or the maximum number.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(nlogn)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int thirdMax(int[] nums) {
        int[] distinct = Arrays.stream(nums).distinct().sorted().toArray();
        return distinct.length > 2 ? distinct[distinct.length - 3] : distinct[distinct.length - 1];
    }
}
```