# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We just need iterate over the input word and check symbols.
# Approach
<!-- Describe your approach to solving the problem. -->
We, using while, iterate over the input string. If we get '0' we just keep iterating, otherwise we skip 3 indexes and increment result var.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int minimumMoves(String s) {
        int result=0;
        int index =0;

        while (index<s.length())
        {
            if(s.charAt(index)=='O') {
            index++;
            }
            else {
                index+=3;
                result++;
            }
        }

        return result;
    }
}
```