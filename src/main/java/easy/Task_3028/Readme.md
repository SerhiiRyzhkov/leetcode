# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem requires a direct approach, iterating over the array and updating the position at each step. We do not need to consider complex algorithms, as it is a straightforward tracking problem.
# Approach
<!-- Describe your approach to solving the problem. -->
We use additional var position to track a current position of an ant. Then, we iterate over the array and calculate a new position for the ant. If the new position = 0, we increment the result var and return it in the end.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int position = 0;
        int result =0;
        for (int num : nums) {
            position += num;
            if (position == 0) result++;
        }


        return result;
    }
}
```