# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s a simple task. The main goal is correct syntax with initialisation of a new array.
# Approach
<!-- Describe your approach to solving the problem. -->
It is nothing to describe. We just return a new array where we calculate kelvins and fahrenheits. It`s impossible to solve easier.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius+273.15,celsius*1.80+32.00};
    }
}
```