# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The good decision will be the using set to collect every digit from input s.

# Approach
<!-- Describe your approach to solving the problem. -->
I iterate over input string and wrote digits to TreeSet. Then I check if there are at least two digits I could find in input string. If I collect at least two digits, I convert set to list, reverse it and return the second value because in TreeSet all the digits were sorted in ascending order.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int secondHighest(String s) {
        Set<Integer> digits = new TreeSet<>();

        for(int i=0;i<s.length();i++)
            if((s.charAt(i)>47)&&(s.charAt(i)<58))digits.add(s.charAt(i)-'0');

        if(digits.size()<2) return -1;

        List<Integer> list = new ArrayList<>(digits);
        Collections.reverse(list);

        return list.get(1);
    }
}
```