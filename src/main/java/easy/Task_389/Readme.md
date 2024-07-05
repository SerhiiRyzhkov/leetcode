# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It is very convenient to use HashMap to resolve the problem
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly we create and fill two hashmap containers. They consist each letter from the input string and the amount of their appearance in those strings. Then we iterate over t String Map and search a letter that the S hashmap does not consist or at least the number of it`s appearance lower than in T hashmap. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public char findTheDifference(String s, String t) {

        Map<Character,Integer> tMap = getMap(t);
        Map<Character, Integer> sMap = getMap(s);

        for(Map.Entry<Character,Integer> m : tMap.entrySet())
            if((!sMap.containsKey(m.getKey()))||(!sMap.get(m.getKey()).equals(tMap.get(m.getKey()))))return m.getKey();

        return t.charAt(0);
    }

    private Map<Character,Integer> getMap(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
            map.put(str.charAt(i),map.containsKey(str.charAt(i))?map.get(str.charAt(i))+1:1);

        return map;
    }
}
```