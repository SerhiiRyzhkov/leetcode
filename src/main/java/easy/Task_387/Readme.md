# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
According to the fact that we have to control a char and amount of its appearance in the world it will be comfortable to use Map to keep both this features at the same time.
# Approach
<!-- Describe your approach to solving the problem. -->
We create LinkedHashMap container it will let us keep character, number of its appearance and the order of the chars in the word. We, using loop, fill the container. Then we just return the first index of character that appears just once in the word.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++)
            if (!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
            else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);


        for(Map.Entry<Character,Integer> m : map.entrySet())
            if (m.getValue() == 1) return s.indexOf(m.getKey());

        return -1;
    }
}
```