# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We can use StringBuilder to resolve the problem. Also, we can use substring.
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the input String. And count amount of spaces. When we get the last space we stop iterating. And by that moment we know index where the String has to be truncated. So we return truncated String. Also, we use trim method to delete last space.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String truncateSentence(String s, int k) {
        int index=0;

        while ((k>0)&&(index<s.length()))
            if(s.charAt(index++)==' ')k--;


        return s.substring(0,index).trim();
    }
}
```