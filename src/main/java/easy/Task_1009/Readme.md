# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
I have to find some Integer method to work with bits of the input int. 
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we transform n to binary view with toBinaryString method and then transform the string to char array. Then we iterate over this array. We know that every number in binary means 2^index (but we have to iterate in reverse way). Iterating over the array, if we have '0', it means that we should switch it to '1' and add 2^index to result. However, we iterate in the reverse way, so we can not use index, and we use count var. Count var is the same as index. Then we just return the result var.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(1)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int bitwiseComplement(int n) {
        int result = 0;
        char[] arr = Integer.toBinaryString(n).toCharArray();

        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]=='0')result+=Math.pow(2,count);
            count++;
        }

        return result;
    }
}
```