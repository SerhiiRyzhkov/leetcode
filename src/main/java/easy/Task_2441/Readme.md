# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Set is very convenient way to resolve the problem.
# Approach
<!-- Describe your approach to solving the problem. -->
Using Stream API we transform the input array into set. Then, we, using max var, iterate over the set and search the maximal value that is contained in set in positive and negative forms. And return the value.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int max = -1;
        for(Integer i: set)if((Math.abs(i)>max)&&(set.contains(-1*i)))max=Math.abs(i);

        return max;
    }
}
```