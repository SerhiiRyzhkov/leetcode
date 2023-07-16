# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We should keep data about elements and sequences in hashmap container
# Approach
<!-- Describe your approach to solving the problem. -->
We create HashMap container where we keep element and maximum length of sequence. Then we iterate over the array. If we already have previous element of sequence in hashmap we put in hashmap length of previous element +1. Else we understand that it is a new sequence, so we put to hashmap container a new element that will be the first element of a new sequence, so length = 1. On the every iteration we overwrite max length to result var and after iterating return it. 
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> map = new HashMap<>();
        // INDEXES - Max LENGTH
        int result = 1;

        for (int a : arr) {
            if (map.containsKey(a - difference)) map.put(a, map.get(a - difference) + 1);
            else map.put(a, 1);
            result = Math.max(result, map.get(a));
        }
            return result;
    }
}
```