# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
If some node is the centre pf graph it has to appear in each element of the input array
# Approach
<!-- Describe your approach to solving the problem. -->
We create map where we write down each node and number of its appearance in the array. Then Using Stream API we return the element which number of appearance equal to the input array.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int[] edge : edges) {
            map.merge(edge[0], 1, Integer::sum);
            map.merge(edge[1], 1, Integer::sum);
        }
        return
                map.entrySet().stream().filter(el->el.getValue()==edges.length).findFirst().get().getKey();
    }
}
```