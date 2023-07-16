# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need to parse the input int to array of its digits.
# Approach
<!-- Describe your approach to solving the problem. -->
The way we can get the minimal sum is to combine min digits with max digits. To get there - we transform the input num to an array and sort it. Then we collect maximal and minimal digits from the array and combine them (min with max) and return the result.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(nLogN)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int minimumSum(int num) {
        int [] arr = new int[4];
        for(int i=0;i<4;i++)
           arr[i]=Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
        Arrays.sort(arr);

        return arr[0]*10+arr[2]+arr[1]*10+arr[3];
    }
}
```