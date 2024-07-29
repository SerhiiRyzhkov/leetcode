# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s simple if else problem. But we need to be careful with types long and int when we multiply length, height and width.
# Approach
<!-- Describe your approach to solving the problem. -->
We create two boolean vars (bulky and heavy). Then we switch their value according to problem description. Essential to compare long value of volume otherwise we can get an error. Then we just consider few cases and return the correct result.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;
        boolean heavy = false;

        if(length>=10000||width>=10000||height>=10000||((long) width*length*height>=Math.pow(10,9)))bulky=true;
        if (mass>=100) heavy=true;

        if(bulky&&heavy) return "Both";
        if(!bulky&&!heavy)return "Neither";
        if(bulky) return "Bulky";
        else return "Heavy";
    }
}
```