# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
HashMap definitely will help to resolve the problem.
# Approach
<!-- Describe your approach to solving the problem. -->
First step: We create hashmap where keep characters and number of their appearance in the input string.

Second step: we diminish number of character appearance and increment count var. When we do not have what to diminish in the map container, it is the time to return count.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer>map = new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }


        while (!map.isEmpty()) {
            for (int i = 0; i < target.length(); i++) {
                char ch = target.charAt(i);
                if (map.containsKey(ch)) {
                    if (map.get(ch) == 0) return count;
                    map.put(ch, map.get(ch) - 1);
                } else {
                    return count;
                }
            }
            count++;
        }

        return count;
    }
}
```