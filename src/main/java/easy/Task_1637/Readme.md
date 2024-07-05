# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We need to resolve only X axis to resolve a problem.
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly, we write down to list all X from the input array. Then we sort the list. Then we iterate over the list and check the differences between neighbour elements. The maximal difference we keep in result var, and we return that var after iterating.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(nlogn)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for(int[] a: points)list.add(a[0]);
        Collections.sort(list);

        for(int i=0;i<list.size()-1;i++)result=Math.max(result,list.get(i+1)-list.get(i));
        return result;
    }
}
```