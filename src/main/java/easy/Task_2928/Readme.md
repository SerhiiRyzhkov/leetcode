# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
There are two ways to resolve the problem. The first one is building some Tree. It`s fast method, but complicated code. The second one: inner loops. It is much easier code. But code will not work as fast as the first method.
# Approach
<!-- Describe your approach to solving the problem. -->
So we use bruteforce. We create three inner loops. One loop means one child. Then we check every combination. If combination suits as we increase result var, otherwise we check the next combination. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n3)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int distributeCandies(int n, int limit) {
        int result =0;
        for(int i=0;i<=limit;i++)
            for(int j=0;j<=limit;j++)
                for(int k=0;k<=limit;k++)
                    if(i+j+k==n)result++;
        return result;
    }
}
```