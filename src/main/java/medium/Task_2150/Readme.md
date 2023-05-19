# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Using a hashmap container will make the solution shorter and easier.
# Approach
<!-- Describe your approach to solving the problem. -->
We create hashMap and fill with numbers from the input array and numbers of their appearance in the array. In result list we write down only numbers, which are unique in the input array and do not have any adjacent numbers.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<Integer> findLonely(int[] nums) {
               List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int num:nums) if(map.containsKey(num))map.put(num,map.get(num)+1); else map.put(num,1);

        for(int n:map.keySet()) if((map.get(n)==1)&&(!map.containsKey(n-1))&&(!map.containsKey(n+1))) result.add(n);
        
        return result; 
    }
}
```