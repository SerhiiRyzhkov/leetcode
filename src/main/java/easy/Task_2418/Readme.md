# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Regarding the fact that all Integers are unique we are able to create map container, where int is a key.
# Approach
<!-- Describe your approach to solving the problem. -->
We create TreeMap container where height is a key, and name is a value. Besides, we set as a param Collection.reverseOrder because we have to return an answer array in desc order. Then we write down all the input data to treemap. And return map as Array of values.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());

        for(int i=0;i<heights.length;i++)
            map.put(heights[i],names[i]);
        return map.values().toArray(new String[0]);
    }
}
```