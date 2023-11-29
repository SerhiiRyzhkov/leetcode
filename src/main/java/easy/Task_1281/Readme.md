# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The best idea is to impress n as a string to consider every digit separately.
# Approach
<!-- Describe your approach to solving the problem. -->
We create two vars: sum and product. Then we iterate over the string and work with every digit. Then we just return the difference between product and sum.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int subtractProductAndSum(int n) {
               int sum=Character.getNumericValue(String.valueOf(n).charAt(0));

        int product=Character.getNumericValue(String.valueOf(n).charAt(0));

        for(int i=1;i<String.valueOf(n).length();i++)
        {
            int d = Character.getNumericValue(String.valueOf(n).charAt(i));
            sum+=d;
            product*=d;
        }

        return product-sum; 
    }
}
```