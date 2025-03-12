# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
There are two ways to solve a problem:
1)Transform to String and search for '0' in a String.
2)Use operator & if all the bits are '1' in bin.
# Approach
<!-- Describe your approach to solving the problem. -->
The second way is much faster and quite brief, so we choose it. So we use operator & between n and n(+1). We get 0 only in a case when all bits are '1'. So, we keep iterating n, until we get '0'.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int smallestNumber(int n) {
        while ((n&(n+1))!=0)n++;
    return n;
    }
}
```