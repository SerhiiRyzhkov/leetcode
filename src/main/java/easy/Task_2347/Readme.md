# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Hashmap will help to count amounts of each element
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly we check suits. Regarding we consider only "FLUSH" combination here we use Set to check if the all elements in the array are the same. Next, we check ranks. Here we use hashmap. Method merge help us fill the map with all the elements from ranks array and amount of each element appearance. We search max amount of appearance and according to it, we return the result with switch operator.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Set<Character>set = new HashSet<>();
        for(char ch:suits)set.add(ch);
        if(set.size()==1)return "Flush";

        Map<Integer, Integer> map = new HashMap<>();
        for(int rank: ranks) map.merge(rank,1,Integer::sum);
        return
                switch (map.values().stream().max(Comparator.naturalOrder()).get()) {
                    case 2 -> "Pair";
                    case 3,4 -> "Three of a Kind";
                    default -> "High Card";
                };
    }
}
```