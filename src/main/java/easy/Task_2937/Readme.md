# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need find a common part among all of 3 input Strings and then manipulate with them
# Approach
<!-- Describe your approach to solving the problem. -->
Using while, we search a common part among 3 strings. The size of common part = i. Then we check if we can cut out a common part from every string. If we can not, we return -1, otherwise we calculate amount of chars that we have to cut off from strings. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int i = 0;

        while (i<s1.length()&&
                i<s2.length()&&
                i<s3.length()&&
                s1.charAt(i)==s2.charAt(i)&&s2.charAt(i)==s3.charAt(i)) {
            i++;
        }


        if(i==0||s1.length()<i||s2.length()<i||s3.length()<i)return -1;

        else return s1.length()-i+s2.length()-i+s3.length()-i;
    }
}
```