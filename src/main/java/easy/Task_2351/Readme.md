# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The best way to resolve the problem is using Set.

# Approach
<!-- Describe your approach to solving the problem. -->
Set add() method returns boolean. "True" if it\`s possible to add a new value and "false" if it\`s the set already has that value. So we start to add every char from input String to Set. And the first "false" from add() method will mean that we have found the answer! Because it will be the second attempt to add the value to the set.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public char repeatedCharacter(String s) {

        char [] array = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for(int i=0; i<array.length; i++)
            if(!set.add(array[i]))return array[i];
        

        return 'x';
    }
}