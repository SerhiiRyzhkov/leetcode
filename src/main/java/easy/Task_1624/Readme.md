# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It is convenient to keep the information about chars and their positions in a map container.
# Approach
<!-- Describe your approach to solving the problem. -->
We create hashmap where we keep chars from the input string and a list with positions of those chars in the string. We fill the map with in a loop. If the size of map and the string are equals it is means that we do not have the substring and chars that appears at least twice in the string. In this case we should return -1. Otherwise, we need to find maximal distance between the same chars. It has to be the first and the last element in lists in hashmap.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int result=0;
        Map<Character,List<Integer>>map = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.putIfAbsent(s.charAt(i),new ArrayList<>());
            map.get(s.charAt(i)).add(i);
        }
        if(map.size()==s.length())return -1;

        for(Map.Entry<Character,List<Integer>> m: map.entrySet())result=Math.max(result,m.getValue().get(m.getValue().size()-1)-m.getValue().get(0)-1);

        return result;

    }
}
```