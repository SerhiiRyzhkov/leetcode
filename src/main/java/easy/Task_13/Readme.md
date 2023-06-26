# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We definitely will need hashmap to keep Roman numbers and their Integer equivalent.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we create hashmap where keep all the Roman numbers and their Integer equivalents. Then we iterate over the input string and check every char and next char and add or remove the corresponding integer from the result var.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--)
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))result-=map.get(s.charAt(i));
            else result+=map.get(s.charAt(i));
            
        return result;
    }
}
```