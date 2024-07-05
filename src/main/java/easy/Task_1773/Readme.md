# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Switch case is quite suitable for this problem.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we use switch case and get the comprehension what rule key we get. According to it, we assign the value to the var key. Then we just increment count var when an item suits to the ruleValue. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int key = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };

        for(List<String> item:items)
            if(item.get(key).equals(ruleValue))count++;

        return count;
    }
}
```