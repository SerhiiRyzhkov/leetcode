# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Using stream API let us get the code briefly
# Approach
<!-- Describe your approach to solving the problem. -->
We initialize max var. Then we check every row in the input array if it`s sum is bigger than max var. If it is, we rewrite max var and return it in the end.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;

        for(int [] ar:accounts)
            if(Arrays.stream(ar).sum()>max)max=Arrays.stream(ar).sum();

        return max;
    }
}
```