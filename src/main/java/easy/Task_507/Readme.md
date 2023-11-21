# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should check all the numbers from 1 to num to resolve the problem
# Approach
<!-- Describe your approach to solving the problem. -->
We create service var a equals to num. We will decrement it. We check all the numbers if they are divisors of num. If they are we add them to sum. We do it util sum is equals or less to num. Because, obviously, if the sum is greater than num, num can not be perfect. In the end we check if the sum is equals to num.  
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num%2!=0)return false;
        int a = num;
        int sum = 0;

        while ((sum<=num)&&(a>1)){
            a--;
            if(num%a==0)sum+=a;
        }

        return sum==num;
    }
}
```