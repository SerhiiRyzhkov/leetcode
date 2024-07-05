# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The best way is using bruteforce method.
# Approach
<!-- Describe your approach to solving the problem. -->
At start, we create result var. Then we iterate over the input array, take every number and search for the max digit in that number. After that we create number like '1111' or '22222' using pow method. And then we add the new number to the result var.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int result=0;
        for (int num : nums) {
            int max = 0;
            String number = String.valueOf(num);
            for (int j = 0; j < number.length(); j++) 
                max = Math.max(max, Character.getNumericValue(number.charAt(j)));
            
            for (int j = 0; j < number.length(); j++)
                result += max * Math.pow(10, j);
        }
        return result;
    }
}
```