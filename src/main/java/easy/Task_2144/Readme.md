# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Definitely, we will need to sort the input array to resolve a problem.
# Approach
<!-- Describe your approach to solving the problem. -->
The idea is: we take the most expensive candy and the second after most expensive. The third expensive candy we get free. So we take all the candies util in the store more than 2 candy. When in the store less than 2 candies. We get all of them. So we iterate over the sorted array we have at least 3 candies in the store and add numbers to result var. Then we just add to result price of all candies then still left in a store.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int minimumCost(int[] cost) {
        int result=0;
        Arrays.sort(cost);
        int index=cost.length-1;
        while (index>=2)
        {
            result+=cost[index]+cost[index-1];
            index-=3;
        }

        for(int i=0;i<=index;i++)
            result+=cost[i];
        return result;
    }
}
```