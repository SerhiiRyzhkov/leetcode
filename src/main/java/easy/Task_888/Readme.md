# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The best way to resolve the task is using inner loops and checking each element from the first element with each element from the second one.
# Approach
<!-- Describe your approach to solving the problem. -->
We calculate sum of each array with API stream. Now we are aware what difference we are looking for. Then we iterate over two arrays using inner loops. We check each pair of elements. The difference between them have to be a half of total difference between two arrays.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n2)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceSum = Arrays.stream(aliceSizes).sum();
        int bobSum = Arrays.stream(bobSizes).sum();

        for (int alice : aliceSizes)
            for (int bob : bobSizes)
                if (aliceSum-bobSum==(alice-bob)*2) return new int[]{alice, bob};

        return null;
    }
}
```