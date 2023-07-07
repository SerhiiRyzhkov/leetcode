# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s will be easy to resolve using treemap, because we need to put words in natural order.

# Approach
<!-- Describe your approach to solving the problem. -->
We split the input string by " ", also we create TreeMap container. We iterate over the input string and put all the string in format Number-Word to TreeMap container. Then using stringbuilder we append every word to result from the treemap (words are already in natural order in the container). Finally, we have to cut off the last space and return the result.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> map = new TreeMap<>();
        String[] arr = s.split(" ");
        for (String value : arr)
            map.put(Integer.parseInt(value.substring(value.length() - 1)), value.substring(0, value.length() - 1));

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Integer, String> m: map.entrySet())
            sb.append(m.getValue()).append(" ");


        return sb.substring(0,sb.length()-1);
    }
}
```