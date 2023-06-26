# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need var counter to count numbers of letter in the string.
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the input string and count the input letters. Then we return the percentage of characters using (int) to round down double value to integer value.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int percentageLetter(String s, char letter) {
        double count=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==letter)count++;
        return (int)(100*count/s.length());
    }
}
```