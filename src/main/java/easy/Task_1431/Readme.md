# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
We will need iterate over input array and check every element
# Approach
<!-- Describe your approach to solving the problem. -->
Firstly we found the maximal amount of candies among all children. Then we iterate over the array and check if the current amount plus extra candies is bigger than maximal amount or not and write down boolean value to result List.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean>result = new ArrayList<>();
        System.out.println(max);
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}
```