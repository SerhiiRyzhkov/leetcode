# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem should be solved with StringBuilder.
# Approach
<!-- Describe your approach to solving the problem. -->
We create an additional method decode, which decode every number. Then we need to understand we should take single-digit or double-digit number. To make it easier we iterate over the string in reverse order. Every decoded part we append to stringbuiled. Regarding we iterated over the String in reverse order, we have to return result also in reverse order. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!='#')
            sb.append(decode(String.valueOf(s.charAt(i))));
            else {
                sb.append(decode(s.charAt(i - 2) + "" + s.charAt(i - 1)));
                i-=2;
            }
        }

          return sb.reverse().toString();
    }

    private String decode(String d){
        return String.valueOf((char) (96 + Integer.parseInt(d)));
    }
}
```