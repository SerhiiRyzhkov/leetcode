# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We can use getNumericValue method to resolve the problem
# Approach
<!-- Describe your approach to solving the problem. -->
We create var sum. Then we iterate over x as String value - we have to consider each character. Each character we transform to integer and add it to the sum var.
After that, we check if x is divisible to sum and return correct sum if it is. Otherwise, we return -1.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;

        for(int i=0;i<String.valueOf(x).length();i++)
            sum+=Character.getNumericValue(String.valueOf(x).charAt(i));

        return x%sum==0?sum:-1;
    }
}
```