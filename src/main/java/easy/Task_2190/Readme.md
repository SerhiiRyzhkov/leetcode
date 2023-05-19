# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
It`s comfortable to use hashmap container to keep integers and numbers of their appearance.
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the array and search for targets. If we found a target we write down ot to the hashmap. If hashmap already keep this integer, we just iterate it`s value in hashmap. The integer with max value in hashmap will be the answer!
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer,Integer> map = new HashMap<>();

        int target=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==key){
                target=nums[i+1];
                if(map.containsKey(target))map.put(target,map.get(target)+1);
                else map.put(target,1);
            }


        }

        return map.entrySet().stream().max((el1,el2)->el1.getValue() > el2.getValue()?1:-1).get().getKey();
    }
}
```