# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
There are several possible ways to resolve the problem. But probably we will need to iterate over the input sequence 
and increment count var.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly we initialize var count. Then we create a new string equal to the input string. Then we increment the count var
and concatenate the new string while the input sequence contains the concatenated string.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        String s = word;
        while (sequence.contains(s)){count++; s+=word;}
        return count;
    }
}

```