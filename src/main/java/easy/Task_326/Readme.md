# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The best way to solve problem is "while"
# Approach
<!-- Describe your approach to solving the problem. -->
We devide input value (as double) by 3 until it is less than 1. If we reach "1.00" it means that we have to return "true". Because 3^x=input value. If input value become less than "1" it means that we have to stop to devide and have to return "false".
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isPowerOfThree(int n) {
        double a=n;
        while (a>=1){
            if(a==1)return true;
            a/=3;
        }
        return false;
    }
}
```