# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We may consider input num as a String. It will help to find the numbers that we have to change.
# Approach
<!-- Describe your approach to solving the problem. -->
We create String max. It`s the input num in string view. Then we look for the first number that we could change to 9 (the maximum digit). It can be any number except 9. In the same way we find min value. Then we just return max-min.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int minMaxDifference(int num) {
        String max = String.valueOf(num);
        String min = String.valueOf(num);


        for(int i=0;i<max.length();i++)
            if(max.charAt(i)!='9') {
                max=max.replace(max.charAt(i), '9');
                break;
            }
        for(int i=0;i<min.length();i++)
            if(max.charAt(i)!='0')
            {
                min=min.replace(min.charAt(i),'0');
                break;
            }

        return Integer.parseInt(max)-Integer.parseInt(min);
    }
}
```