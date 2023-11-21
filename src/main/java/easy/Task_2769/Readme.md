# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
I should take few numbers and their results and find out the dependency.
# Approach
<!-- Describe your approach to solving the problem. -->
We just add amount of times twice (decreasing and increasing) and add it to num
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int theMaximumAchievableX(int num, int t) {
      return num+t*2;  
    }
}
```