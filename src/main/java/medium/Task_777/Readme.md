# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should not replace parts of String it can be endless.
# Approach
<!-- Describe your approach to solving the problem. -->
We use 2 marks. The first one for start String, the second one is for end string. Then we use while circle until neither of marks reached end of any String. We move mark to the first 'X' appearance in both strings. Then we know that we are able to move 'L' only to left and 'R' only to the right. And we check few conditions when we are not able to do any moves. If we are not able to do any moves, and we still did`t reach we return false. Otherwise, we keep do these procedures until marks still inside strings.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean canTransform(String start, String end) {
        if (!start.replace("X", "").equals(end.replace("X", "")))
            return false;

        int mark1 = 0;
        int mark2 = 0;

        while(mark1 < start.length() && mark2 < end.length()){

            while(mark1 < start.length() && start.charAt(mark1) == 'X')mark1++;
            while(mark2 < end.length() && end.charAt(mark2) == 'X')mark2++;
           
           
            if(mark1 == start.length() && mark2 == end.length())return true;
            
            if(mark1 == start.length() || mark2 == end.length())return false;

            if(start.charAt(mark1) != end.charAt(mark2))return false;
            
            if(start.charAt(mark1) == 'L' && mark2 > mark1)return false;
            
            if(start.charAt(mark1) == 'R' && mark1 > mark2)return false;
            
            mark1++;
            mark2++;
        }
        return true;
    }

}

```