# Intuition
Using hashmap we may create a dictionary where we are free to keep every character from a string and the amount of their appearance in the string.
# Approach
<!-- Describe your approach to solving the problem. -->
We create an additional method getMap - where we create a map from String value - and fill it by chars and amount of their appearance. Then we just iterate over ransomeNote map and search for a char that are not in a magazine, or number of if appearance is lower than in ransomeNote. If we do not have that we return true, otherwise we return false.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransomMap = getMap(ransomNote);
        Map<Character,Integer> magazineMap = getMap(magazine);

        for(Map.Entry<Character,Integer> m: ransomMap.entrySet())
            if(!magazineMap.containsKey(m.getKey())||magazineMap.get(m.getKey())<m.getValue())return false;

        return true;
    }

    private Map<Character,Integer> getMap(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        return map;
    }
}
```