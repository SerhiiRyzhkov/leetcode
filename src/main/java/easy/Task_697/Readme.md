# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need to keep element, it`s index of the first appearance, index of the last appearance, and amount of appearances in the array. So, we will use hashmap.
# Approach
<!-- Describe your approach to solving the problem. -->
We create hashmap container kind of: <Element,new int{first appearance, last appearance, amount} and fill it. Then we iterate over the map and look for the biggest degree with the lowest length. When we find it, we write down its params to element and degree vars. Then we have to return length of a subarray. It is easy to do because we know the index of the first elements appearance and the last one.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int findShortestSubArray(int[] nums) {

        // Integer - [first appearance, last appearance, amount]

        TreeMap<Integer, int []> map = new TreeMap<>();
        int degree = 0;
        int element = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i], new int[]{i,i,1});
            else map.put(nums[i], new int[]{map.get(nums[i])[0],i,map.get(nums[i])[2]+1});
            if(map.get(nums[i])[2]>degree)
            {
                degree=map.get(nums[i])[2];
                element=nums[i];
            }
            if((map.get(nums[i])[2]==degree)&&(
                    (map.get(nums[i])[1]-map.get(nums[i])[0])<
                            (map.get(element)[1]-map.get(element)[0])))
            {
                degree=map.get(nums[i])[2];
                element=nums[i];
            }
        }

         return map.get(element)[1]-map.get(element)[0]+1;
    }
}

```