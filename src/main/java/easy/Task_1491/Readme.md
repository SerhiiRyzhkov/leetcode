# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The perfect opportunity to practice stream API.
# Approach
<!-- Describe your approach to solving the problem. -->
We transform array to stream, then filter it: we cut off max and min values, then we return average value as double. It is not the fastest solution, but the briefest. Just 1 row.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public double average(int[] salary) {
        return Arrays.stream(salary).filter(el->((el!=Arrays.stream(salary).min().getAsInt())&&
                (el!=Arrays.stream(salary).max().getAsInt()))).average().getAsDouble();
    }
}
```