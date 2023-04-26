# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We might separate input String using split() method.
# Approach
<!-- Describe your approach to solving the problem. -->
We split the input string. Then check every element if the element a number and if it bigger than previous one. If the number is not bigger than previous one we break the iteration and return false.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean areNumbersAscending(String s) {
        int a=0;
        String [] array = s.split(" ");
        for(int i=0;i<array.length;i++)
        {
            try {
                if(Integer.valueOf(array[i])<=a)return false;
                else a=Integer.valueOf(array[i]);
            }
            catch (NumberFormatException e) {continue;}
        }
        
        return true;
    }
}
```