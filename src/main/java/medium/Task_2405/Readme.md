# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We may use Stringbuilder to build every substring with unique chars. And keep them in List container.
# Approach
<!-- Describe your approach to solving the problem. -->
We create list container of Stringbuilders. Then iterating over the input string we add every char to stringbuilder. If stringbuilder already has the char, we add the stringbuilder to List, and the character write down to the new Stringbuilder. Then everything we need is to return List size. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n^2)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int partitionString(String s) {
        List<StringBuilder> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if (sb.toString().contains(String.valueOf(s.charAt(i)))) {
                list.add(sb);
                sb = new StringBuilder();
                sb.append(s.charAt(i));
            }
            else {
                sb.append(s.charAt(i));
            }


        }
        list.add(sb);
        return list.size();
    }
}
```