# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
According to the fact that we need to compare nums and their indexes we will need to keep them together in hashmap container.

# Approach
<!-- Describe your approach to solving the problem. -->
We create hashmap container where we keep numbers and their indexes. Then we iterate over the input array. If we don`t have a number in hashmap we put there the number with it`s index. If we have that one, it means we have found duplicate. We, using the information from hashmap, check if the conditions with abs is true and then return true or keep iterating further over the array. 

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            if(!map.containsKey(nums[i]))map.put(nums[i],i);
            else {
                if(Math.abs(i-map.get(nums[i]))<=k)return true;
                else map.put(nums[i],i);
            }
        }
            return false;
    }
}
```