# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
After resolving first few steps we can see it`s classical fibonacci problem
# Approach
<!-- Describe your approach to solving the problem. -->
So, the answer according fibonacci function will be the sum of previous two elements. So we just fill the array according the function and return n-element of the array
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int climbStairs(int n) {

        int [] array = new int[n+2];

        array[1]=1;
        array[2]=2;


        for(int i=3;i<array.length;i++)
            array[i]=array[i-1]+array[i-2];

        return array[n];
    }
}
```