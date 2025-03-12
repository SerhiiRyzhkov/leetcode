# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
There are two ways to resolve a problem:
1)Stream API. Very brief code. But we need to check the input array twice. So it`s not a very fast way.
2)Classical loop with two vars. It is much faster but code is getting longer.
# Approach
<!-- Describe your approach to solving the problem. -->
I choose Stream API solution. My idea is that Alice does not win only when sum of two-digits numbers is equal one-digits numbers. So we need just to compare sums. If sums are not equal Alice inevitably win.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public boolean canAliceWin(int[] nums) {
       return Arrays.stream(nums).filter(el->el<10).sum()!=Arrays.stream(nums).filter(el->el>9).sum();
    }
}
```