# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
There are two obvious ways to resolve a problem:
1)Using set
2)Using the fact, that we are sure that the String keeps only English letters.
# Approach
<!-- Describe your approach to solving the problem. -->
So, we use two vars. The first one is a result var, we use it to count amount of special characters. And the second one is a char var. We use it to check each letter from 'A' to 'Z' char. We check each letter with indexOf method. It`s not the fastest way to resolve a problem, because we check the String twice with each letter, but probably the shortest one.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int numberOfSpecialChars(String word) {
        int result =0;
        char ch='A'-1;

        while (ch++<='Z')
            result+=(word.indexOf(ch)!=-1&&word.indexOf(ch+32)!=-1)?1:0;
        
        return result;
    }
}
```