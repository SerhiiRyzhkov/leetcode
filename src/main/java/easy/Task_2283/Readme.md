# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Map container would be useful to keep there all digits from a string and number of their appearance.
# Approach
<!-- Describe your approach to solving the problem. -->
We create Map<digit, number of appearance> container and fill it. Then we iterate over the input string and check each digit. We use map container to compare indexes and numbers of appearance. If each digit correlates, we return true. Otherwise, we return false.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();

        for(Character ch: num.toCharArray())
            map.put(Character.getNumericValue(ch),map.getOrDefault(Character.getNumericValue(ch),0)+1);


        for (int i=0;i<num.length();i++) {
            map.putIfAbsent(i, 0);
            if (map.get(i) != Character.getNumericValue(num.charAt(i))) return false;

        }
        return true;
    }
}
```