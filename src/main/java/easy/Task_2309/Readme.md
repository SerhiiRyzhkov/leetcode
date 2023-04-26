# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should separate input String into two different sets: uppercase and lowercase and then compare them.

# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the input string and add every char to one of two sets (with uppercase and lowercase). Characters to lowercase set are being written after their transforming into uppercase. Then using retainAll method we found out what chars are kept in both sets. Then we return max value of their intersection if intersection is not empty

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String greatestLetter(String s) {
        Set<Character> upperSet = new HashSet<>();
        Set<Character> lowerSet = new HashSet<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>64)&&(ch<91))upperSet.add(ch);
            if((ch>96)&&(ch<123))lowerSet.add((char)(ch-32));
        }


        upperSet.retainAll(lowerSet);
        if(upperSet.isEmpty())return "";
        int i = upperSet.stream().mapToInt(el->el).max().getAsInt();
        
        return String.valueOf((char)(i));
    }
}
```