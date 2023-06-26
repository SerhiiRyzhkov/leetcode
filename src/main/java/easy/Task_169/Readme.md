# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Hashmap will easily resolve the problem.
# Approach
<!-- Describe your approach to solving the problem. -->
We iterate over the input array and add to hashmap elements of the array and their numbers of appearances. As soon we get the element, that value in hashmap more than n/2 we have to return this element.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
            if (map.get(num) > nums.length / 2) return num;
        }
        return -1;
    }
}
```