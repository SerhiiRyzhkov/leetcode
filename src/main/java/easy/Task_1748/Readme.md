# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We can use hashmap to keep elements and the information if they are unique
# Approach
<!-- Describe your approach to solving the problem. -->
We create map, where we keep each element from the array and number of their appearance. Then we need to calculate a sum of unique elements (with value =1). It is convenient to use API Stream. So, we transform map to stream, then filter it, then transform to stream of keys and calculate the sum of unique elements. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int sumOfUnique(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
         for(Integer num:nums)
             map.put(num,map.getOrDefault(num,0)+1);

        return
                map.entrySet().stream().filter(el->el.getValue()==1).mapToInt(Map.Entry::getKey).sum();
    }
}
```