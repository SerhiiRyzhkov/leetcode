# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We could use % operator to define if we need divide or subtract on each step.
# Approach
<!-- Describe your approach to solving the problem. -->
Using % operator we define if we need subtract or divide on each step and do that. In that time, we count the amount of steps using count var. We do it until num>0 and in the end we return count.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;

        while (num>0){
            num=num%2==0?num/2:num-1;
            count++;
        }

        return count;
    }
}
```