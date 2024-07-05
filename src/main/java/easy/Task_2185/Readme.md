# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need iterate over the input array and increment a counter
# Approach
<!-- Describe your approach to solving the problem. -->
We create a counter var. Then we iterate over the input array and check every word with a method startsWith(). Then we return the counter.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for (String w: words)
            if(w.startsWith(pref))count++;
        return count;
    }
}
```