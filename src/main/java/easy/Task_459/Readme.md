# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
There are few possible ways to resolve the problem: stringbuilder, split(), contains() etc.
# Approach
<!-- Describe your approach to solving the problem. -->
We take first half of input string because a part of word which we search can not be bigger than half of full input string. Then we check can be part with current size be part of full string according to it`s size. Then we take a half of possible part and concatenate it using Stringbuilder. When we get stringbuilder with size as the input string we check if they are equal. If they are equal we return true.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n^2)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for (int i = s.length() / 2; i >= 1; i--) {
            if(l%i==0) {
                int middle = l/i;
                String sub = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < middle; j++)
                    sb.append(sub);
            if(sb.toString().equals(s)) return true;
        }
    }
    return false;
    }
}

```