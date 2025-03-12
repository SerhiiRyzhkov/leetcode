# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s not necessary to create an array to resolve it. Because have the consequence, and we are able to calculate the next element easy.
# Approach
<!-- Describe your approach to solving the problem. -->
We create a resul var. Then we know amount elements (n) so we change an array to while loop. On each element n-1 we calculate new value of result var. In the end, we just return result.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int xorOperation(int n, int start) {
        int result = 0;

        while (--n>=0) result = result ^ (start + 2 * n);
        return result;
    }
}
```