# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s classical Fibonacci task
# Approach
<!-- Describe your approach to solving the problem. -->
We just create an array with a size as n. And fill it with fibonacci numbers. Then we just return the last element of the array.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int fib(int n) {
        int [] array = new int[n+1];
        array[0]=0;
        if(array.length>1)array[1]=1;
        for(int i=2;i<array.length;i++)
            array[i]=array[i-1]+array[i-2];
        return array[n];
    }
}
```