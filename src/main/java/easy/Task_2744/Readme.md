# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Set will help us to solve solution. And stringbuilder is a possible way to reverse words from the array.
# Approach
<!-- Describe your approach to solving the problem. -->
We use additional method where we return reverse of String, that was created using strinbuilder.
We create Set container. Then we iterate over the array. Is set container contains the reverse of current String we increment result var, otherwise we add the word to the container without changing.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int result=0;
        Set<String>set = new HashSet<>();
        for (String word : words)
            if (set.contains(getReverse(word))) result++;
            else set.add(word);

         return result;
    }
    private String getReverse(String w){
        StringBuilder sb = new StringBuilder();
        for(int i=w.length()-1;i>=0;i--)
            sb.append(w.charAt(i));
        return sb.toString();
    }
}
```