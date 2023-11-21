# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
HashMap perfectly suits here. It let us avoid regex.
# Approach
<!-- Describe your approach to solving the problem. -->
We create HashMap container where we keep position - and word. Then we iterate over the String and fill up HashMap. Then we use StringBuilder and create final String and return it. Method trim let us reduce last space? 
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
        Map<Integer,String> map = new HashMap<>();
        for(String word: s.split(" "))
            map.put(Character.getNumericValue(word.charAt(word.length()-1)),word.substring(0,word.length()-1));

        StringBuilder sb = new StringBuilder();
        int i=1;

        while (map.containsKey(i)){
            sb.append(map.get(i++)).append(" ");
        }

        return sb.toString().trim();
    }
}
```