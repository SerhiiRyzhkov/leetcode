# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It will be easy to solve using boolean var and iteration over the input array.
# Approach
<!-- Describe your approach to solving the problem. -->
We create boolean var and result var. Then we iterate over the input array. Firstly boolean is false. It means we are beyond "|" symbols, and we have to increment result var every time when we get "*" symbol. When we get "|" symbol we change boolean var, and now we don`t increment result var until we get "|" one more time. After end of the iteration, everything we need is return the result var.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int countAsterisks(String s) {
        boolean flag = false;
        int result =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|')flag=!flag;
            if((!flag)&&(s.charAt(i)=='*'))result++;
        }

        return result;
    }
}
```