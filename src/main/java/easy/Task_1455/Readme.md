# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It is easy to solve with split function
# Approach
<!-- Describe your approach to solving the problem. -->
We split the String with space. Then we iterate over the array and search for word with the same prefix as searchWord. If we find that - we return index+1 otherwise we return -1.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        int result = -1;

        String [] array = sentence.split(" ");

        for(int i=0;i<array.length;i++)
            if(array[i].startsWith(searchWord)) {result=i+1; break;}

        return result;
    }
}
```