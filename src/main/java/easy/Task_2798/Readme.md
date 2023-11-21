# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Java Stream API perfectly suits here
# Approach
<!-- Describe your approach to solving the problem. -->
Using Java Stream API, we filter array and return its size
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
                return (int) Arrays.stream(hours).filter(el->el>=target).count();
    }
}
```