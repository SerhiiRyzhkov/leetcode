# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It will be easy to solve using brute force method
# Approach
<!-- Describe your approach to solving the problem. -->
We just check every number to n and check them if they satisfy the condition. Then we return the result var.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int sumOfMultiples(int n) {

        int result =0;
        for(int i=0;i<=n;i++)
            if((i%3==0)||(i%5==0)||(i%7==0))result+=i;

        return result;
    }
}
```