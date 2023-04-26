# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should consider input string as an array with words from that string.
# Approach
<!-- Describe your approach to solving the problem. -->
Using split method we separate input string to separate words. And return the last one`s length.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int lengthOfLastWord(String s) {
        String [] array = s.split(" ");

        return array[array.length-1].length();
    }
}
```