# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It is convenient to keep vowel chars in a set container.
# Approach
<!-- Describe your approach to solving the problem. -->
We put all the vowel chars to a set container. Then we iterate over the interval from left to right and check if the word suits us. If it suits - we increment count var and after iterating we return it.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        Set<Character> set = new HashSet<>(List.of('a','e','i','o','u'));

        int count = 0;

        for(int i=left;i<=right;i++)
            if(set.contains(words[i].charAt(0))&&set.contains(words[i].charAt(words[i].length()-1)))count++;
        return count;
    }
}
```