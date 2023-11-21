# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Stringbuilder suits here perfectly
# Approach
<!-- Describe your approach to solving the problem. -->
We create two stringbuilders and get together all the elements from input arrays. Then we just check if that stringbilders are equals.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();


        Arrays.stream(word1).forEach(sb1::append);
        Arrays.stream(word2).forEach(sb2::append);


        return sb1.toString().equals(sb2.toString()); 
    }
}
```