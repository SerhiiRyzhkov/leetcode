# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We could use hashmap to chain letter to numbers.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we create hashmap where we keep letters a-z and their numbers 1-26. Then we fill it. After that we check every letter in the input string and using formula we add every letter to the result.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int titleToNumber(String columnTitle) {
        Map<Character,Integer> map = new HashMap<>();

        int result=0;
        char ch = 'A';
        int count = 1;

        while (ch<='Z')
            map.put(ch++,count++);

        for(int i=0;i<columnTitle.length();i++)
            result+=(map.get(columnTitle.charAt(i)))*Math.pow(26,columnTitle.length()-i-1);


        return result;
    }
}
```