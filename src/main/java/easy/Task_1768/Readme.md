# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Stringbuilder is the obvious way to solve problem.
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the input words, and if any char exists in the input word under current index we add it to the stringbuilder, else we just continue iterate over the input words. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<Math.max(word1.length(),word2.length());i++){
            if(word1.length()>i)stringBuilder.append(word1.charAt(i));
            if(word2.length()>i)stringBuilder.append(word2.charAt(i));
        }
        return stringBuilder.toString();
    }
}
```