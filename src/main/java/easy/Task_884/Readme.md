# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
HashSet or HashMap solution will help to solve the problem.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, using split method we write all the words to the list. Then we iterate over the list and write to HashMap container all the words and number of their appearance in list. Then we return array of Strings that have one appearance in the list. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String>result = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();

        List<String> list = new ArrayList<>(Arrays.stream(s1.split(" ")).toList());
        list.addAll(Arrays.stream(s2.split(" ")).toList());

        for (String s : list) {
            if (map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }

        for(Map.Entry<String,Integer> el: map.entrySet() )
            if(el.getValue()==1)result.add(el.getKey());

        return result.toArray(new String[0]);
    }
}
```