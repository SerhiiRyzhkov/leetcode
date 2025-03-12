# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to represent num as array with digits like chars.
# Approach
<!-- Describe your approach to solving the problem. -->
We represent num to an array with digits with String.valueOf(num).toCharArray() method. Then, we check each element and increment the result var. In the end, we just return the result var.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int countDigits(int num) {
        int result = 0;
        for (Character ch: String.valueOf(num).toCharArray())
            if(num%Character.getNumericValue(ch)==0)result++;
        return result;
    }
}
```