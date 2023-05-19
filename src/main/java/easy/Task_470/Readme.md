# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We might initialize two vars (x and y), and change them during iterating over the input array;
# Approach
<!-- Describe your approach to solving the problem. -->
We create empty array "result" and initialize two vars: x and y. Then we iterate over the input array. If the element`s index is even we write down x and increment x var, else we write down y and increment y. Also, we should consider special case: when the input array length = 1, then we have to return input array as a result.

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int[] shuffle(int[] nums, int n) {

        if(nums.length==1)return nums;

        int[] result = new int[nums.length];
        int x=0;
        int y =nums.length/2;


        for (int i = 0; i < nums.length; i++){
            if(i%2==0) result[i]=nums[x++];
            else result[i]=nums[y++];
    }
        return result;
    }
}
```