# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should write new values to the matrix after the every iteration over the ops array. It`s very slow. We have to find other solution.
# Approach
<!-- Describe your approach to solving the problem. -->
We do not need to increase every element of the matrix. It`s would take a lot of time, so we will be out of time limit. So we use an easier solution. Regarding the fact we need to return only amount of cells where will be the maximal values it does not matter for us what will be kept in other cells. So we should only find the zone with maximal values. The zone sides sizes are limited by minimal elements from ops array. So we find them. Then we just return amount of cells. It will be side a * side * b. And we do not now the maximal value. But we do not need that. We only need amount of cells. So we have found that. And we are in time limit. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0)return m*n;

        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;

        for (int[] op : ops) {
            a = Math.min(a, op[0]);
            b = Math.min(b, op[1]);

        }
        return a*b;
    }
}
```