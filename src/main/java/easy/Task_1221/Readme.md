# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need few counters and increment them during the iteration over the input string.
# Approach
<!-- Describe your approach to solving the problem. -->
We create 3 vars counters: L counter, R counter, and result counter. Then we iterate over the String and when the amount of 'L' and 'R' are equal, we increment result var.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int balancedStringSplit(String s) {
        int countL=0;
        int countR=0;
        int result=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')countR++;
            if(s.charAt(i)=='L')countL++;
            if((countL==countR)&&(countL!=0)){
                result++;
                countL=0;
                countR=0;
            }
        }
        return result;
    }
}
```