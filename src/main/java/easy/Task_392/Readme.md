# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
There are a lot of ways to solve problem: using hashmap, iterating over two arrays, List interface methods() etc.
# Approach
<!-- Describe your approach to solving the problem. -->
We transform s String to list of characters. Then we iterate over t string and if we find matching with s string we remove the character from the s string. If we successfully deleted all the characters from s, then we have to return true. Otherwise, we return false. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isSubsequence(String s, String t) {
        List<Character> list = new ArrayList<>();
        for(char ch:s.toCharArray()) list.add(ch);
        int index=0;
        while ((!list.isEmpty())&&(index<t.length()))
        {
            if((t.charAt(index++))==list.get(0))list.remove(0);
        }

        return list.size()==0;
    }
}

```