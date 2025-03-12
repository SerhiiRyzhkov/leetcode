# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We just need to iterate over the array and count the result. It`s simple task with for loop and work with indexes.
# Approach
<!-- Describe your approach to solving the problem. -->
We create result var. Then we iterate over the input String starting from the element#1 and on each iteration we add to result Math abs of the difference the current element and the previous one. Finally, we return the result. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int scoreOfString(String s) {
        int result = 0;

        for(int i=1;i<s.length();i++)
            result+= Math.abs(s.charAt(i-1)-s.charAt(i));

        return result;
    }
}
```